package com.qa.day2.parameter;

public class BasicCalculator {
	
	//make a method that returns an integer
	//This method should take in an integer and then return it
	public int returnInt(int num) {
		return num;
	}

	public String returnGreeting(String name, String time) {
		return "Good "+ time + " " + name + "!";
	}
	
	//Operators are symbols used to manipulate numerical data
	// + adds things together
	// - subtracts numbers
	// / divides numbers (10/3 = 3)
	// / multiplies numbers
	// % modulus, returns the remainder (10/3 = r1)
	// < less than
	// > more than
	// = make something exactly this (String text = "hello")
	// == checking if something is something else
	
	//method that takes in two numbers & adds them
	public String addSum(int x, int y, int z) {
		//make a new variable called result
		int result = 0;
		// result is equal to the sum of x and y
		result = x + y + z;
		//return result
		return x + "+" + y + "+" + z + "=" + result;
	}
	
	public String subSum(int x, int y) {
		if (x < y) {
			return "This result is negative";
		} else {
			int result = x - y;
			return x + "-" + y + "=" + result;
		}
	}
	
	public String multSum(int x, int y) {
		if (y == 10) {
			return "That's too easy for a calculator";
		} else {
			int result = x * y;
			return x + "x" + y + "=" + result;
		}
	}
	
	public String divSum(int x, int y) {
		
		if (y == 0) {
			return "You can't divide by 0";
		} else {
			float result= x / y; //Run / in else, so /0 is never returned, avoiding errors
			return x + "/" + y + "=" + result;
		}
		
	
	}
	
	public String squareSum(int x) {
		int result = x * x;
		return x + "²" + "=" + result;
			
	}
	
	public int raisePower(int x, int y) {
		int result = (int) Math.pow(x, y);
		return result;
	}
	
	public String oddEven (int x) {
		if (x % 2 == 0) {
			return x + " is an even number";
	} else {
		return x + " is an odd number";
		}
	}
	
	public int multFive(int x) {
		int result = x * x;
		if (result % 5 == 0) {
		System.out.println("the following number is a multiple of five");
		} 
		return result; 
	}
	
	
}
