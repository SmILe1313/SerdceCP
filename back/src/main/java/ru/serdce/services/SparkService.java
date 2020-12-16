package ru.serdce.services;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.ml.Pipeline;
import org.apache.spark.ml.PipelineModel;
import org.apache.spark.ml.PipelineStage;
import org.apache.spark.ml.classification.DecisionTreeClassifier;
import org.apache.spark.ml.classification.DecisionTreeClassificationModel;
import org.apache.spark.ml.classification.RandomForestClassificationModel;
import org.apache.spark.ml.classification.RandomForestClassifier;
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator;
import org.apache.spark.ml.feature.*;
import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.serdce.entities.AllDataView;
import ru.serdce.models.Field;
import ru.serdce.models.FieldConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.spark.sql.functions.col;

@Service
public class SparkService {
  // БД
  public static String driver = "org.postgresql.Driver";
  public static String url = "jdbc:postgresql://localhost:5432/serdce";
  public static String user = "postgres" ;
  public static String password = "postgres";
  public static String tableName = "alldata";

  // local files
  public static String filePath = "D:\\Git\\Github\\SerdceCP\\back\\src\\main\\resources\\";
  public static String fileNameDb = "integral.xlsx";
  public static String sheetTrainName = "train";
  public static String fileNamePredict = "for_test.xls";

  private Map<String, PipelineModel> actualModel = new HashMap<>();
  private Map<String, Double> accuracyModel = new HashMap<>();

  @Autowired JavaSparkContext sc;

  public String trainFromSource(String _readingName, String whatTrain) {
    Dataset<Row> dbDataFrame = readingDb(_readingName);
    //    Dataset<Row> xlsDataFrame = readingXls(_fileName);
    //    xlsDataFrame = castColumns(xlsDataFrame);
    //    training(xlsDataFrame, whatTrain);
    return training(dbDataFrame, whatTrain);
  }

  public Double predictFromSource(String _readingName, String whatPredict) {
    //    Dataset<Row> xlsDataFrame = readingXls(_readingName);
    Dataset<Row> dbDataFrame = readingDb(_readingName);
    //    xlsDataFrame = castColumns(xlsDataFrame);
    //    predict(xlsDataFrame, whatPredict);
    return predicting(dbDataFrame, whatPredict);
  }

  public Dataset<Row> readingDb(String _tableName) {
    final SparkSession sparkSession = SparkSession.builder()
      .appName("Spark Local").master("local[3]").getOrCreate();
    SQLContext sqlContext = new SQLContext(sparkSession);
    Dataset<Row> rows = sqlContext.read()
      .format("jdbc")
      .option("url", url)
      .option("driver", driver)
      .option("dbtable", _tableName)
      .option("user", user)
      .option("password", password)
      .load();
    return rows;
  }

  public List<String> trainAll(String _readingName) {
    Dataset<Row> dbDataFrame = readingDb(_readingName);

    List<String> trained = new ArrayList<>();
    for (String whatTrain : FieldService.diagnoz.keySet()) {
      String trainRes = training(dbDataFrame, whatTrain);
      trained.add(trainRes);
    }
    return trained;
  }

  // Обучение
  public String training(Dataset<Row> rowDataset, String whatTrain) {
    try {

//      rowDataset.show(false);

      String[] colsForTrain = FieldService.fieldsToTrain;
      String handleInvalid = "skip";

      StringIndexer indexerPol = new StringIndexer()
        .setInputCol("pol")
        .setOutputCol("polIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerSemya = new StringIndexer()
        .setInputCol("semya")
        .setOutputCol("semyaIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerEtnos = new StringIndexer()
        .setInputCol("etnos")
        .setOutputCol("etnosIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerNatsionalnost = new StringIndexer()
        .setInputCol("natsionalnost")
        .setOutputCol("natsionalnostIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerReligiya = new StringIndexer()
        .setInputCol("religiya")
        .setOutputCol("religiyaIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerObrazovanie = new StringIndexer()
        .setInputCol("obrazovanie")
        .setOutputCol("obrazovanieIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerProfessiya = new StringIndexer()
        .setInputCol("professiya")
        .setOutputCol("professiyaIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerStress_iz_za_finans = new StringIndexer()
        .setInputCol("stress_iz_za_finans")
        .setOutputCol("stress_iz_za_finansIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerDostatok_po_srav_s_drug = new StringIndexer()
        .setInputCol("dostatok_po_srav_s_drug")
        .setOutputCol("dostatok_po_srav_s_drugIndexer")
        .setHandleInvalid(handleInvalid);

      StringIndexer indexerTip_zhilya = new StringIndexer()
        .setInputCol("tip_zhilya")
        .setOutputCol("tip_zhilyaIndexer")
        .setHandleInvalid(handleInvalid);

      VectorAssembler assembler = new VectorAssembler()
        .setInputCols(colsForTrain)
        .setOutputCol("features")
        .setHandleInvalid(handleInvalid);

//      Dataset<Row> rowDatasetWithFeatures = assembler
//        .transform(rowDataset)
//        .select("features", whatTrain);

//      PolynomialExpansion polyExpansion = new PolynomialExpansion()
//        .setInputCol("features")
//        .setOutputCol("polyFeatures")
//        .setDegree(1);

//      PCA pca = new PCA()
//        .setInputCol("features")
//        .setOutputCol("pcaFeatures")
//        .setK(1);

//      DecisionTreeClassifier dt = new DecisionTreeClassifier()
//        .setLabelCol(whatTrain)
//        .setFeaturesCol("features")
//        .setMaxDepth(30);

      RandomForestClassifier dt = new RandomForestClassifier()
        .setLabelCol(whatTrain)
        .setFeaturesCol("features")
        .setMaxDepth(30)
        .setNumTrees(300);

      Pipeline pipeline = new Pipeline()
              .setStages(new PipelineStage[]{indexerPol, indexerSemya, indexerEtnos,
                indexerNatsionalnost, indexerReligiya, indexerObrazovanie, indexerProfessiya,
                indexerStress_iz_za_finans, indexerDostatok_po_srav_s_drug, indexerTip_zhilya,
                assembler, dt});

//      DecisionTreeClassificationModel model = dt.train(trainingData);

//      ParamMap[] paramGrid = new ParamGridBuilder()
//        .addGrid(pca.k(), new int[] {5, 10,20,30,40,50,60,70,80,90,100,110,117})
//        .build();

      Dataset<Row>[] splits = rowDataset.randomSplit((new double[]{0.7, 0.3}));
      Dataset<Row> trainingData = splits[0];
      Dataset<Row> testData = splits[1];

      trainingData.cache();
      testData.cache();

      PipelineModel model = pipeline.fit(trainingData);

      Dataset<Row> predictions = model.transform(testData);

      predictions.select("prediction",whatTrain, "features").show(30);

      MulticlassClassificationEvaluator evaluator = new MulticlassClassificationEvaluator()
        .setLabelCol(whatTrain)
        .setPredictionCol("prediction")
        .setMetricName("accuracy");

//      CrossValidator cv = new CrossValidator()
//        .setEstimator(pipeline)
//        .setEvaluator(evaluator)
//        .setEstimatorParamMaps(paramGrid)
//        .setNumFolds(3);
//
//      CrossValidatorModel cvModel = cv.fit(trainingData);

//      DecisionTreeClassificationModel treeModel =
//        (DecisionTreeClassificationModel) (model.stages()[1]);

      RandomForestClassificationModel treeModel =
        (RandomForestClassificationModel) (model.stages()[11]);

//      System.out.println("Learned classification tree model:\n" + treeModel.toDebugString());

//      Dataset<Row> predictions = cvModel.transform(testData);

      double accuracy = evaluator.evaluate(predictions);
      double error = (1.0 - accuracy);
      System.out.println("Test Error = " + error);

      // Пока так
      this.actualModel.put(whatTrain, model);
      this.accuracyModel.put(whatTrain, accuracy);

//      pipeline.write().overwrite().save(filePath + whatTrain + ".model");
//      model.write().overwrite().save(filePath + whatTrain + ".model");
//      DecisionTreeModel oldModel = model.toOld();
//      oldModel.save(sc.sc(), filePath + whatTrain + ".model");
//      model.save(filePath + whatTrain + ".model");
//      sc.parallelize((Arrays.asList(model)), 1).saveAsObjectFile(filePath + whatTrain + ".model");

      return "train ok. Test error = " + error;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return "train error";
    }
  }

  // Прогноз
  public Double predicting(Dataset<Row> predictDataset, String whatPredict) {
    try {

//      DecisionTreeClassificationModel model = DecisionTreeClassificationModel.load(whatPredict + ".model");

      PipelineModel model = this.actualModel.get(whatPredict);

      if (model == null) {
        System.out.println("Need to perform machine learning first");
        return -1.0;
      }

//      VectorAssembler assembler = new VectorAssembler()
//        .setInputCols(artGip)
//        .setOutputCol("features");
//
//      Dataset<Row> predictDatasetWithFeatures = assembler
//        .transform(predictDataset)
//        .select("features", whatPredict);

      Dataset<Row> predictions = model.transform(predictDataset);

      System.out.println("Prediction:");
      predictions.select("prediction", whatPredict, "features").show(30);

      MulticlassClassificationEvaluator evaluator = new MulticlassClassificationEvaluator()
        .setLabelCol(whatPredict)
        .setPredictionCol("prediction")
        .setMetricName("accuracy");

//      DecisionTreeClassificationModel treeModel =
//        (DecisionTreeClassificationModel) (model);
//      System.out.println("Learned classification tree model:\n" + treeModel.toDebugString());

      double accuracy = evaluator.evaluate(predictions);
      System.out.println("Predict Error = " + (1.0 - accuracy));

      Double predict = (Double) predictions.select("prediction").collectAsList().get(0).get(0);
      System.out.println("predict ok. " + whatPredict + " prediction = " + predict + " accuracy = " + this.accuracyModel.get(whatPredict));
      return predict;

    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("predict error");
      return -1.0;
    }
  }

  public List<Field> predictAll(Dataset<Row> predictDataset) {
    List<Field> predictedFields = new ArrayList<>();
    for (String whatPredict : FieldService.diagnoz.keySet()) {
      Field predictField = predictOne(predictDataset, whatPredict);
      if (predictField != null) {
        predictedFields.add(predictField);
      }
    }
    return predictedFields;
  }

  public Field predictOne(Dataset<Row> predictDataset, String whatPredict) {
    Double predict = predicting(predictDataset, whatPredict);
    Field predictField = null;

    if(predict == 1) {
      String rusName = FieldService.diagnoz.get(whatPredict);
      Double accuracy =100 * (whatPredict.equals("arterialnaya_gipertenziya") ? accuracyModel.get(whatPredict) : accuracyModel.get(whatPredict) - 0.1);
      predictField = new Field(
        whatPredict,
        rusName,
        "indicator",
        new FieldConfig(rusName, new String[]{ accuracy.toString() }));
    }
    return predictField;
  }

  public Dataset<Row> convertToDataset(AllDataView personData) {
    final SparkSession sparkSession = SparkSession.builder()
      .appName("Spark Local").master("local[3]").getOrCreate();
    SQLContext sqlContext = new SQLContext(sparkSession);
    List<AllDataView> personDataList = new ArrayList<AllDataView>();
    personDataList.add(personData);
    Dataset<Row> df = sqlContext.createDataFrame(personDataList, AllDataView.class);
    return df;
  }

  public Dataset<Row> readingXls(String _fileName) {
    final SparkSession sparkSession = SparkSession.builder()
      .appName("Spark Local").master("local[3]").getOrCreate();
    SQLContext sqlContext = new SQLContext(sparkSession);
    Dataset<Row> rows = sqlContext.read()
      .format("com.crealytics.spark.excel")
      .option("location", filePath)
      .option("sheetName", sheetTrainName)
      .option("header", "true")
      .option("treatEmptyValuesAsNulls", "true")
      .option("inferSchema", "true")
      .option("addColorColumns", "false")
      .load(filePath + _fileName);
    return rows;
  }

  // Схема файла XLS
  public String[] getSchemaXls(String _fileName) {
    Dataset<Row> xlsDataFrame = readingXls(_fileName);
    xlsDataFrame.printSchema();
    return xlsDataFrame.columns();
  }

  // Преобразование колонок к нужному типу и имени
  public Dataset<Row> castColumns(Dataset<Row> dataFrame) {
    return dataFrame
      .withColumn("pol", col("pol").cast("double"))
      ;
  }

  // Запись в БД
  public String writingToBase(Dataset<Row> dataSet, String tableName) {
    try {
      dataSet.write()
        .mode(SaveMode.Append)
        .format("jdbc")
        .option("url", url)
        .option("dbtable", tableName)
        .option("user", user)
        .option("password", password)
        .save();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return "writing error";
    }
    return "writing ok";
  }

  public Long getCount() {
    JavaRDD<String> words = sc.textFile(filePath + fileNameDb);
    return words.count();
  }

  // Схема файла CSV
  public String[] getSchemaCsv(String _fileName) {
    Dataset<Row> csvDataFrame = readingCsv(_fileName);
    csvDataFrame.printSchema();
    return csvDataFrame.columns();
  }

  public Dataset<Row> readingCsv(String _fileName) {
    final SparkSession sparkSession = SparkSession.builder()
      .appName("Spark CSV").master("local[3]").getOrCreate();
    final DataFrameReader dataFrameReader = sparkSession.read();
    dataFrameReader.option("header", "true");

    final Dataset<Row> csvDataFrame = dataFrameReader.csv(filePath + _fileName);
    //    sparkSession.stop();
    return csvDataFrame;
  }

  // Запись файла Xls в БД
  public String writeToBaseXls(String _fileName, String tableName) {
//    String tableName = "dict_column_name";
    Dataset<Row> dataFrame = readingXls(_fileName);
    return writingToBase(dataFrame, tableName);
  }

  // Запись файла CSV в БД
  public String writeToBaseCsv(String _fileName) {
    String tableName = "tablecsv";
    Dataset<Row> csvDataFrame = readingCsv(_fileName);
    return writingToBase(csvDataFrame, tableName);
  }

}
