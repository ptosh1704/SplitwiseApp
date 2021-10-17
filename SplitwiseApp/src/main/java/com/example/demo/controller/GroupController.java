package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Group;
import com.example.demo.model.User;
import com.example.demo.service.GroupService;

public class GroupController {
		GroupService groupService;
		
		public void setGroupService(GroupService userService) {
			this.groupService=userService;
			
		}
		
		public Group addGroup(int groupId, String groupname, List<Integer> groupmembers) {			
			return groupService.addGroup(groupId, groupname, groupmembers);
		}

}
