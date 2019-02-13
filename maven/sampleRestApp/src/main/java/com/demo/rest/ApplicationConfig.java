package com.demo.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.demo.rest.service.UserService;

//@ApplicationPath("/")
public class ApplicationConfig extends Application {
  //@SuppressWarnings("unchecked")
  public Set<Class <?>> getClasses()  {
    return new HashSet<Class <?>>(Arrays.asList(UserService.class));
  }
}
