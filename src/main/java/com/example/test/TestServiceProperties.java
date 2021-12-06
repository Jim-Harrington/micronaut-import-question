package com.example.test;

import io.micronaut.context.annotation.Property;

public class TestServiceProperties {

  private String result = null;

  public TestServiceProperties(@Property(name = "com.example.test.result") String val) {

    result = val;
  }

  public String getResult() {

    return result;
  }

  public void setResult(String val) {
    
    result = val;
  }
}
