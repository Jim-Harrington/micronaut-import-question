package com.example.test;

import io.micronaut.context.annotation.Import;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(classes = {TestService.class,
                   TestServiceProperties.class})
public @interface EnableTestService {
}
