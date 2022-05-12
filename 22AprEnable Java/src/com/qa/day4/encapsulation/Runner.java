package com.qa.day4.encapsulation;

public class Runner {
	
	public static void main (String[] args) {
		
		BankDetails user1 = new BankDetails(125, "34188391829", "JSmith32", "1234Abcd!");
		
		// Hacker has got into main, and is able to system out password
		System.out.println(user1.getPassword("coconut")); //getPassword() returns our password
		
		// Any user can update and change their balance to any value
		
//		user1.setBalance() = 1000000;
		user1.setBalance(1000000);
		System.out.println(user1.getBalance());
		
		// The user goes to a ATM and wants to take out £20
		user1.setBalance(80); // because the balance is private
	}
	
	// A hacker has got into the bank, and wants to get the user password!
	
		
	

}
