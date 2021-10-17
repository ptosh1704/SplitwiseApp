package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.model.Bill;
import com.example.demo.model.User;

public class BillService implements BillInterface {
	
	public static Map<Integer , Bill> billholder = new HashMap<>();

	@Override
	public Bill addBill(int billid, int groupid, Double amount, Map<Integer, Double> contribution,  Map<Integer, Double> paidBy) {
		Bill bill = new Bill();
		bill.setBillid(billid);
		bill.setGroupid(groupid);
		bill.setAmount(amount);
		bill.setContribution(contribution);
		bill.setPaidBy(paidBy);
		
		billholder.put(billid, bill);
		return bill;
	}

}
