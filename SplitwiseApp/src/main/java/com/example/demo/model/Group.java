package com.example.demo.model;

import java.util.List;

public class Group {
	int groupid;
	String groupname;
	List<Integer> groupmembers;
	
	
	@Override
	public String toString() {
		return "Group [groupid=" + groupid + ", groupname=" + groupname + ", groupmembers=" + groupmembers + "]";
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public List<Integer> getGroupmembers() {
		return groupmembers;
	}
	public void setGroupmembers(List<Integer> groupmembers) {
		this.groupmembers = groupmembers;
	}
	 

	
}
