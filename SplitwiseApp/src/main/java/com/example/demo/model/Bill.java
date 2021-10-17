package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public class Bill {
	int billid;
	int groupid;
	Double amount;
	Map<Integer, Double> contribution = new HashMap<>();
	Map<Integer, Double> paidBy = new HashMap<>();
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Map<Integer, Double> getContribution() {
		return contribution;
	}
	public void setContribution(Map<Integer, Double> contribution) {
		this.contribution = contribution;
	}
	public Map<Integer, Double> getPaidBy() {
		return paidBy;
	}
	public void setPaidBy(Map<Integer, Double> paidBy) {
		this.paidBy = paidBy;
	}
	@Override
	public String toString() {
		return "Bill [billid=" + billid + ", groupid=" + groupid + ", amount=" + amount + ", contribution="
				+ contribution + ", paidBy=" + paidBy + "]";
	}
	 
	
	

}
