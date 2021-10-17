package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Group;
import com.example.demo.model.User;

public interface GroupInterface {
	public Group addGroup(int groupid, String groupname, List<Integer> groupmembers );

}
