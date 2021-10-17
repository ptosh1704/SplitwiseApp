package com.example.demo.service;

import java.util.Map;

import com.example.demo.model.Bill;
import com.example.demo.model.User;

public interface BillInterface {
	
	public Bill addBill(int billid, int groupid, Double amount, Map<Integer, Double>contribution, Map<Integer, Double> paidBy );

}
