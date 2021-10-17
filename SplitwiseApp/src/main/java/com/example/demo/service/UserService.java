package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.User;

public class UserService implements UserInterface {
	
	public static List<User> userdetails = new ArrayList<>();

	@Override
	public User addUser(int userid, String userName) {
		User user = new User(userid,userName);
		userdetails.add(user);
		return user;
		
	}

}
