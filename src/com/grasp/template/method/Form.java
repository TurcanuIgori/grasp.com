package com.grasp.template.method;

import java.util.List;

abstract class Form {

  private String title;
  private List<String> header;
  private List<String> inputElements;
  private List<String> aditionalInputElements;
  private List<String> components;
  private List<String> bottomHeader;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<String> getHeader() {
    return header;
  }

  public void setHeader(List<String> header) {
    this.header = header;
  }

  public List<String> getInputElements() {
    return inputElements;
  }

  public void setInputElements(List<String> inputElements) {
    this.inputElements = inputElements;
  }

  public List<String> getAditionalInputElements() {
    return aditionalInputElements;
  }

  public void setAditionalInputElements(List<String> aditionalInputElements) {
    this.aditionalInputElements = aditionalInputElements;
  }

  public List<String> getComponents() {
    return components;
  }

  public void setComponents(List<String> components) {
    this.components = components;
  }

  public List<String> getBottomHeader() {
    return bottomHeader;
  }

  public void setBottomHeader(List<String> bottomHeader) {
    this.bottomHeader = bottomHeader;
  }

  public void buildForm() {
  }

  List<String> buildInputElements() {
    return this.inputElements;
  }
}
