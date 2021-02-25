package com.bankTechbee;

public class BankAccount {
	private double balance;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private double deposit;
	private double depositAmount;
	private double withdrawlAmount;
	private long accountNumber;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@")) {
			this.email = "Valid Email";
		}else {
			this.email = "Invalid Email";
		}
	
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber.length() <10){
			this.phoneNumber ="This is not a valid phone number";
		}
		else {
			this.phoneNumber ="Great job!";
		}
		
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawlAmount() {
		return withdrawlAmount;
	}
	public void setWithdrawlAmount(double withdrawlAmount) {
		this.withdrawlAmount = withdrawlAmount;
	}
	
BankAccount(){
	
	
}
public void depositAmmount() {
	while(deposit > 0) {
		balance = balance + depositAmount;
		System.out.println("Your balance is now: " + balance);
	}
}

public void withdrawl() {
	if (balance>withdrawlAmount) {
		balance = balance - withdrawlAmount;
		System.out.println(firstName+" your balance is now: " +balance);
		
	}
	else {
System.out.println(firstName+" sorry insuffienct funds");
		
	}
}
public void display() {
	System.out.println("Hi"+ firstName+
			"your accont number is: "+accountNumber+" Your balance is: "
			+balance+" Email is: "+email+" phone number is: "+phoneNumber);
}
public void logout() {
	System.out.println("Thank you "+firstName+" you are now logged out");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
