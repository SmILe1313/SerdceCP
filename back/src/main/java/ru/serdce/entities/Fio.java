package ru.serdce.entities;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Immutable
@Subselect("select * from patient")
public class Fio {

  @Id
  private String id;
  private String fio;
  private String pol;
  private String data_rozhdeniya;
  private String vozrast;
  private String mesto_prozhivaniya_1_gorod_2_selo;
  private Boolean hasDiagnostic = false;
  private Boolean requiresAttention;
  private Boolean status;

  public Fio() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFio() {
    return fio;
  }

  public void setFio(String fio) {
    this.fio = fio;
  }

  public String getPol() {
    return pol;
  }

  public void setPol(String pol) {
    this.pol = pol;
  }

  public String getData_rozhdeniya() {
    return data_rozhdeniya;
  }

  public void setData_rozhdeniya(String data_rozhdeniya) {
    this.data_rozhdeniya = data_rozhdeniya;
  }

  public String getVozrast() {
    return vozrast;
  }

  public void setVozrast(String vozrast) {
    this.vozrast = vozrast;
  }

  public String getMesto_prozhivaniya_1_gorod_2_selo() {
    return mesto_prozhivaniya_1_gorod_2_selo;
  }

  public void setMesto_prozhivaniya_1_gorod_2_selo(String mesto_prozhivaniya_1_gorod_2_selo) {
    this.mesto_prozhivaniya_1_gorod_2_selo = mesto_prozhivaniya_1_gorod_2_selo;
  }

  public Boolean getHasDiagnostic() {
    return hasDiagnostic;
  }

  public void setHasDiagnostic(Boolean hasDiagnostic) {
    this.hasDiagnostic = hasDiagnostic;
  }

  public Boolean getRequiresAttention() {
    return requiresAttention;
  }

  public void setRequiresAttention(Boolean requiresAttention) {
    this.requiresAttention = requiresAttention;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }
}
