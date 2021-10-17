package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Group;
import com.example.demo.model.User;

public class GroupService implements GroupInterface {
	List<Group> groupdetails = new ArrayList<>();

	@Override
	public Group addGroup(int groupid, String groupname, List<Integer> groupmembers) {
		Group group = new Group();
		group.setGroupid(groupid);
		group.setGroupname(groupname);
		group.setGroupmembers(groupmembers);
		
		groupdetails.add(group);
		return group;
		
		
	}

}
