package com.demo.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import com.demo.rest.service.UserService;

@ApplicationPath("/")
public class App extends Application {
  @SuppressWarnings("unchecked")
  @Override
  public Set<Class <?>> getClasses()  {
    Set<Class<?>> classes = new HashSet<Class<?>>();
    classes.add(UserService.class);
    return classes;
    //return new HashSet<Class <?>>(Arrays.asList(UserService.class));
  }
}
