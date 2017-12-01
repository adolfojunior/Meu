package com.example.demo.model;

public class User {

  private String username;

  // TODO add other properties (firstName, lastName, birthdate, email, creationDate, lastLogin,
  // active)
  
  // TODO add password

  public User() {
  }

  public User(String username) {
    this.setUsername(username);
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
