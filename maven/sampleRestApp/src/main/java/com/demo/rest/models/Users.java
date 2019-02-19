package com.demo.rest.models;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users")
public class Users {
  @XmlElement(name = "user")
  private ArrayList users;

  public ArrayList getUsers() {
    return users;
  }

  public void setUsers(ArrayList users) {
    this.users = users;
  }
}
