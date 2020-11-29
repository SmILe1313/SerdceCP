package ru.serdce.models;

public class Field {

  private String fieldName;
  private String fieldLabel;
  private String widget;  //'input/date/select/checkbox/textarea/graph',
  private FieldConfig config;
//    type: 'number/text/date/',
//      options: ['опция1', 'опция2'...]


  public Field(String fieldName, String fieldLabel, String widget, FieldConfig config) {
    this.fieldName = fieldName;
    this.fieldLabel = fieldLabel;
    this.widget = widget;
    this.config = config;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getFieldLabel() {
    return fieldLabel;
  }

  public void setFieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
  }

  public String getWidget() {
    return widget;
  }

  public void setWidget(String widget) {
    this.widget = widget;
  }

  public FieldConfig getConfig() {
    return config;
  }

  public void setConfig(FieldConfig config) {
    this.config = config;
  }
}
