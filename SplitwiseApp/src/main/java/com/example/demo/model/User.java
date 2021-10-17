package com.example.demo.model;

public class User {
	int userid;
	String name;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + "]";
	}
	public User(int userid, String name) {
		super();
		this.userid = userid;
		this.name = name;
	}

	
	
	

}
