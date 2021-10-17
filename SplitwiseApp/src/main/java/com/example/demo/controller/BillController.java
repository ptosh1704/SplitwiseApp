package com.example.demo.controller;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.example.demo.model.Bill;
import com.example.demo.model.User;
import com.example.demo.service.BillService;

public class BillController {
	BillService billService;
	
	public void setBillService(BillService billService) {
		this.billService=billService;	
	}
	
	public Bill addBill(int billid, int groupid, Double amount, Map<Integer, Double> contribution, Map<Integer, Double> paidBy) {
		return billService.addBill(billid, groupid, amount, contribution, paidBy);
	}
	
	public Double getUserBalance(User user1) {
		Double balance=0.0;
		Map<Integer, Bill> map = billService.billholder;
		Set<Entry<Integer, Bill>> set = map.entrySet();
		
		for(Entry<Integer, Bill> e: set) {
			if(e.getValue().getContribution().containsKey(user1.getUserid())) {
				balance-=e.getValue().getContribution().get(user1.getUserid());	
			}
			if(e.getValue().getPaidBy().containsKey(user1.getUserid())) {
				balance+=e.getValue().getPaidBy().get(user1.getUserid());
			}
		}
		
		return balance;
		
	}
	
	
	
}
