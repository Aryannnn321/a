package com.example.actions;

import com.struts.model.User;

public class LoginAction {
 private String userName;
private String city;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
 public String execute() {
	 if(userName.equals("Arya"))
		 return "success";
		 else
			 return "error";
 }
}
