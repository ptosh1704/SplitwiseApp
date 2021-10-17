package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.BillController;
import com.example.demo.controller.GroupController;
import com.example.demo.controller.UserController;
import com.example.demo.model.Bill;
import com.example.demo.model.Group;
import com.example.demo.model.User;
import com.example.demo.service.BillService;
import com.example.demo.service.GroupService;
import com.example.demo.service.UserService;

@RestController
public class MainController {
	UserController userC = new UserController();
	GroupController groupC = new GroupController();
	BillController billC = new BillController();


	
	@GetMapping("/greetings")
	public String greeting() {
		return "Hello! Jai Mata di";
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userC.setUserService(new UserService());
		groupC.setGroupService(new GroupService());
		billC.setBillService(new BillService());
		return userC.addUser(user.getUserid(), user.getName()).toString();

	}

	@PostMapping("/createGroup")
	public String createGroup(@RequestBody Group group) {
		return groupC.addGroup(group.getGroupid(), group.getGroupname(), group.getGroupmembers()).toString();
		
	}
	
	@PostMapping("/addExpenses")
	public String addExpense(@RequestBody Bill bill) {
		return  billC.addBill(bill.getBillid(), bill.getGroupid() , bill.getAmount(), bill.getContribution(), bill.getPaidBy()).toString();
	}
	
	@GetMapping("/getBalance")
		public Double getBalanceforUser(@RequestParam String username, @RequestParam int id ) {
			User user = new User(id, username);
			return  billC.getUserBalance(user);
			
		}
	}
