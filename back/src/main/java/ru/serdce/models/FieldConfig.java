package ru.serdce.models;

public class FieldConfig {
  private String type; // 'number/text/date/',
  private String[] options; // ['опция1', 'опция2'...]

  public FieldConfig(String type, String[] options) {
    this.type = type;
    this.options = options;
  }

  public FieldConfig() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String[] getOptions() {
    return options;
  }

  public void setOptions(String[] options) {
    this.options = options;
  }
}
