package ru.serdce.controller;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdce.entities.AllDataView;
import ru.serdce.entities.User;
import ru.serdce.models.Field;
import ru.serdce.services.SparkService;
import ru.serdce.services.UserService;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApiController {

  @Autowired private UserService userService;

  @Autowired SparkService sparkService;

  @GetMapping("/schema")
  public ResponseEntity<String[]> getSchemaXls(){
    String[] schema = sparkService.getSchemaXls(SparkService.fileNameDb);
    return new ResponseEntity<>(schema, HttpStatus.OK);
  }

  @GetMapping("/train/{whatTrain}")
  public ResponseEntity<String> train(@PathVariable String whatTrain){
    String res = sparkService.trainFromSource(SparkService.tableName, whatTrain);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

  @GetMapping("/trainall")
  public ResponseEntity<List<String>> trainAll(){
    List<String> res = sparkService.trainAll(SparkService.tableName);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

  @GetMapping("/predict/{whatPredict}")
  public ResponseEntity<Double> whatPredict(@PathVariable String whatPredict){
    Double res = sparkService.predictFromSource(SparkService.tableName, whatPredict);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

  @PostMapping("/predictall/{id}")
  public ResponseEntity<List<Field>> predictAll(@PathVariable(value = "id") String id, @RequestBody AllDataView patienData){
    Dataset<Row> patientDataSet = sparkService.convertToDataset(patienData);
    List<Field> res = sparkService.predictAll(patientDataSet);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

  @GetMapping("/write/xsl/{tableName}")
  public ResponseEntity<String> writeXsl(@PathVariable String tableName){
    String res = sparkService.writeToBaseXls(SparkService.fileNameDb, tableName);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

  @GetMapping("/write/csv")
  public ResponseEntity<String> writeCsv(){
    String res = sparkService.writeToBaseCsv(SparkService.fileNameDb);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

  @GetMapping("/words") // get/
  public ResponseEntity<Long> getWords(){
    Long word = sparkService.getCount();
    return new ResponseEntity<Long>(word, HttpStatus.OK);
  }

  @GetMapping("/schema/csv")
  public ResponseEntity<String[]> getSchemaCsv(){
    String[] schema = sparkService.getSchemaCsv(SparkService.fileNameDb);
    return new ResponseEntity<>(schema, HttpStatus.OK);
  }

  @PostMapping("/login")
  public ResponseEntity<User> loginUser(@RequestBody Map<String, String> body){
    String login = body.get("login");
    String password = body.get("password");

    User user = userService.getUserByLogAndPass(login, password);
    userService.setUser(user);
    return new ResponseEntity<User>(user , HttpStatus.OK);
  }

}
