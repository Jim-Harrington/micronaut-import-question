package com.example.test;

import javax.inject.Singleton;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class TestService {

  private static final Logger log = LoggerFactory.getLogger(TestService.class);

  private TestServiceProperties properties = null;
  
  public TestService(TestServiceProperties properties) {

    this.properties = properties;
  }

  public String getFoo() {

    return this.properties.getResult();
  }
}
