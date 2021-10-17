package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

public class UserController {
	UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService=userService;
		
	}
	
	public User addUser(int userid, String userName) {
		return userService.addUser(userid, userName);
	}

}
