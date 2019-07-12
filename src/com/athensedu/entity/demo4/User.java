package com.athensedu.entity.demo4;

public class User {
	private String UserName;
	private String password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [UserName=" + UserName + ", password=" + password + "]";
	}
	

}
