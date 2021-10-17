package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.User;

public class UserRepository {
	public static List<User> userlist = new ArrayList<>();

	public static List<User> getUserlist() {
		return userlist;
	}

	public static void setUserlist(List<User> userlist) {
		UserRepository.userlist = userlist;
	}
	

}
