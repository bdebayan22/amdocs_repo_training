package com.training.web;

public class Login {
private String userName;
private String password;
public Login(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
public Login() {
	super();
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return  userName +   password ;
}


}
