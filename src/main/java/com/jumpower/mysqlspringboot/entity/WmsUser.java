package com.jumpower.mysqlspringboot.entity;


public class WmsUser {

  private Integer userId;
  private String userUsername;
  private String userPassword;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserUsername() {
    return userUsername;
  }

  public void setUserUsername(String userUsername) {
    this.userUsername = userUsername;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public WmsUser() {
  }

  public WmsUser(Integer userId, String userUsername, String userPassword) {
    this.userId = userId;
    this.userUsername = userUsername;
    this.userPassword = userPassword;
  }
}
