package com.example.test;

import io.micronaut.context.annotation.Any;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import javax.inject.Inject;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(rebuildContext = true)
@EnableTestService  // if not included, I get: io.micronaut.context.exceptions.NoSuchBeanException: No bean of type [com.example.test.TestServiceProperties]
public class TestServiceTest
{

  @Inject
  @Any   // if not included, I get: io.micronaut.context.exceptions.NonUniqueBeanException: Multiple possible bean candidates found: [com.example.test.TestService, com.example.test.TestService]
  private TestService svc;

  @Test
  public void testItAll()
      throws Exception
  {

    Assertions.assertTrue("Bar".equals(svc.getFoo()));
  }
}
