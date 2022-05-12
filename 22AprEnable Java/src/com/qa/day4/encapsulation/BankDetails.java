package com.qa.day4.encapsulation;

public class BankDetails {

	// Bank Details is a class that will be used to make an object BankDetails
	
	// Only time you should use numeric data types
	//if you need to work our averages, add them together, sort by numbers
	
	private float balance;
	private String accountNumber; // Uses a string, as int would cut off a 0 at the start of the value
	private String userName;
	private String password;
	// private means data is not accessible from outside this class
	
	// Constructor
	public BankDetails(float balance, String accountNumber, String userName, String password) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
	}
	
	// Encapsulation is used to add methods and functionality to restrict
	// getting and setting the data of our methods.
	// Variables should be private
		
	// By adding getters (retrieve data) and setters (update data)

	// Anyone 'should' be able to see your balance
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		
		// If balance is changed to more than 100, do something
		if (balance > 100) {
			System.out.println("hmm.. suspicious..");
			return;
		} else {
			this.balance = balance;
		}
		
	}

	public String getAccountNumber(String passcode) {
		if(passcode == "mango") {
			return accountNumber;
		} else {
			return "incorrect passcode";
		}
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName(String passcode) {
		if(passcode == "mango") {
		return userName;
		} else {
			return "incorrect passcode";
		}
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword(String passCode) {
		
		if(passCode == "mango") {
		return password;
	} else {
		return "incorrect passcode";
	}
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
