package com.bankTechbee;

import java.util.Scanner;

public class FrontEnd extends BankAccount {

	 
	

	 public static void main(String [ ]args) {
		 BankAccount ba = new BankAccount();
		 Scanner sc = new Scanner(System.in);
		 ba.display();
		 ba.getFirstName();
		 ba.getDeposit();
		 ba.getWithdrawlAmount();
		 ba.logout();
		 
	 }

}
