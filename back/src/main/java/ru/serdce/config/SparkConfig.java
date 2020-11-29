package ru.serdce.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.serdce")
public class SparkConfig {

  @Bean
  public SparkConf conf() {
    return new SparkConf()
      .setAppName("serdce-app")
      .setMaster("local[3]")
      .set("spark.driver.allowMultipleContexts", "true");
  }

  @Bean
  public JavaSparkContext sc() {
    return new JavaSparkContext(conf());
  }

}
