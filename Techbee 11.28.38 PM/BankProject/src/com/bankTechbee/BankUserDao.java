package com.bankTechbee;

import java.util.ArrayList;


public class BankUserDao {
	
	ArrayList<BankAccount> AccountUser = new ArrayList();
	
	BankAccount customer = new BankAccount();
	
	public BankUserDao() {
		customer.setFirstName("Gregory");
		customer.setLastName("Jackson");
		customer.setAccountNumber(324334);
		
	}
	public void updateUser(BankAccount newUser) {
		System.out.println("Hello "+newUser.getFirstName());
	}
public void addUser(BankAccount newUser) {
	AccountUser.add(newUser);
	System.out.println("Welcome "+newUser.getFirstName());
	
}
public void deleteUser(BankAccount newUser) {
	AccountUser.remove(newUser);
	System.out.println("Have a nice day "+newUser.getFirstName());
	
}
public void displayUser() {
	for(BankAccount user: AccountUser) {
		System.out.println("Name of customer - "+user.getFirstName()
		+user.getLastName()
		+user.getAccountNumber());
	}
	
	
	}
}

