package ru.serdce.controller;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.serdce.entities.AllDataView;
import ru.serdce.entities.User;
import ru.serdce.models.Field;
import ru.serdce.services.DataViewService;
import ru.serdce.services.FieldService;
import ru.serdce.services.FioService;
import ru.serdce.services.SparkService;
import ru.serdce.services.UserService;

import java.util.List;

@CrossOrigin
@RestController
public class CrudController {

  @Autowired private UserService userService;

  @Autowired private DataViewService dataViewService;

  @Autowired private FioService fioService;

  @Autowired SparkService sparkService;

  @GetMapping("/patients") // get/
  public ResponseEntity<List<AllDataView>> getDataView20(){
    List<AllDataView> dataViewList = dataViewService.findTop20();
    return new ResponseEntity<List<AllDataView>>(dataViewList, HttpStatus.OK);
  }

  @GetMapping("/patients/{id}") // get/
  public ResponseEntity<AllDataView> getDataView(@PathVariable String id){
    AllDataView data = dataViewService.get(id);
    return new ResponseEntity<AllDataView>(data, HttpStatus.OK);
  }

  @GetMapping("/fields/{category}") // get/
  public ResponseEntity<List<Field>> getFields(@PathVariable String category){
    List<Field> data = FieldService.getFields(category);
    return new ResponseEntity<List<Field>>(data, HttpStatus.OK);
  }

  @PutMapping("/update/patients/{id}")
  public ResponseEntity<AllDataView> updatePatient(@PathVariable(value = "id") String id, @RequestBody AllDataView patienData){
//    Dataset<Row> patientDataSet = sparkService.convertToDataset(patienData);
//    List<Field> res = sparkService.predictAll(patientDataSet);
    return new ResponseEntity<>(patienData, HttpStatus.OK);
  }

//  @GetMapping("/patients") // get/
//  public ResponseEntity<List<Fio>> getPatients(){
//    List<Fio> fioList = fioService.findTop20();
//    return new ResponseEntity<List<Fio>>(fioList, HttpStatus.OK);
//  }
//
//  @GetMapping("/patients/{id}") // get/
//  public ResponseEntity<Fio> getPatients(@PathVariable String id){
//    Fio fio = fioService.get(id);
//    return new ResponseEntity<Fio>(fio, HttpStatus.OK);
//  }

  @GetMapping("/user/{id}") // get/
  public ResponseEntity<User> getUser(@PathVariable Long id){
    User user = userService.get(id);
    return new ResponseEntity<User>(user, HttpStatus.OK);
  }

  @PostMapping("/user") ///create
  public ResponseEntity<User> createUser(@RequestBody User user){
    userService.create(user);
    return new ResponseEntity<User>(user , HttpStatus.CREATED);
  }

  @PutMapping("/user/{id}") //update/
  public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long id, @RequestBody User user){
    userService.update(user, id);
    return new ResponseEntity<User>(user, HttpStatus.OK);
  }

  @DeleteMapping("/user/{id}") //delete
  public ResponseEntity<String> deleteUser(@PathVariable(value = "id") Long id) {
    userService.delete(id);
    return new ResponseEntity<String>("Deleted", HttpStatus.OK);
  }

//  @PutMapping("/clean/{id}") // Для повторной нормализации построчно
//  public ResponseEntity<ValidateResponse> updateClean(@PathVariable(value = "id") Long id, @Valid @RequestBody ValidateSimpleRequest validateSimpleRequest){
//    ValidateRequest validateRequest = validateResponseService.toStandartRequest(validateSimpleRequest);
//    ValidateResponse validateResponse = pochtaService.normalizeAddressApi(validateRequest);
//    validateResponseService.update(validateResponse, id);
//    return new ResponseEntity<ValidateResponse>(validateResponse, HttpStatus.OK);
//  }
//
//  @DeleteMapping("/clean/{id}") //delete
//  public ResponseEntity<String> deleteClean(@PathVariable(value = "id") Long id) {
//    validateResponseService.delete(id);
//    return new ResponseEntity<String>("Deleted", HttpStatus.OK);
//  }
//
//  // Вернуть весь список CleanAddress
//  @GetMapping("/clean/all")
//  public ResponseEntity<List<ValidateResponse>> getAllCleanAddresses() {
//    try {
//      List<ValidateResponse> validateResponseList = validateResponseService.getAll();
//
//      if (validateResponseList.isEmpty()) {
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//      }
//
//      return new ResponseEntity<>(validateResponseList, HttpStatus.OK);
//    } catch (Exception e) {
//      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//  }

}
