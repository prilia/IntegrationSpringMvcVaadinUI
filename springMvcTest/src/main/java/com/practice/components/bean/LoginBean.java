package com.practice.components.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
private String userID;
private String password;
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
