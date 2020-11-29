package ru.serdce.entities;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Entity;
import javax.persistence.Id;
import ru.serdce.models.Field;
import ru.serdce.models.FieldConfig;

//@Entity
//@Immutable
//@Subselect("select * from alldata")
public class Data {

  private Field fio = new Field(
    "fio",
    "ФИО",
    "text",
    new FieldConfig()
  );

  private Field pol = new Field(
    "pol",
    "ФИО",
    "text",
    new FieldConfig()
  );
  private String data_rozhdeniya;
  private String vozrast;
  private String mesto_prozhivaniya_1_gorod_2_selo;
  private Boolean hasDiagnostic = false;
  private Boolean requiresAttention;
  private Boolean status;

  public Data() {
  }

}
