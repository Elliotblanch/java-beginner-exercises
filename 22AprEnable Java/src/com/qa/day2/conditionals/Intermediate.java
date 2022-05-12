package com.qa.day2.conditionals;

public class Intermediate {
	
	//method doesn't return anything
	//takes in a boolean called query
	public void boolDemo(boolean query) {
		
		//if statement to check if query is true
		if(query == true) { //if () takes in a query and either returns true or false
			System.out.println("Query is true!");
		}else {
			System.out.println("Query is false!");
	}
		
		//if query == true do this thing
		if(query) {
			System.out.println("Query is still true");
		}
		
		//!= not equal to
		if(query != true) {
			System.out.println("Query is still false");
		}
		
		//if query is not true
		if(!query) {
			System.out.println("Query is still extremely false");
		}
	}
	
	public void complexIfElse(int num, String colour) {
		
		;
	
		//if statement that checks if num is greater than 8, and if colour is "red"
		//&& AND operator
		//|| OR operator
		if (num > 8 && colour == "red")  {
			//3 other possible states: neither are true, colour is true & num false, num is true & colour false
			System.out.println("num is greater than 8, and colour is red");
		} else if (num > 8) {
			System.out.println("Num is greater than 8, colour is not red");
		} else if (colour == "red") {
			System.out.println("Colour is red, number is not greater than 8");
		} else {
			System.out.println("num is not greater than 8, and colour is not red");
		
		
		}
		//if num is less than 7 OR if colour is blue
		if (num < 7 || colour == "blue") {
			System.out.println("num is less than 7 or colour is blue, maybe both");
			//nesting statements, we can put an if statement INTO an if statement
			if(num < 7 && colour == "blue") {
				System.out.println("Both are true");
			} else if (num < 7) {
				System.out.println("num is less than 7 and colour is not blue");
			} else {
				// we know colour is blue and num is not less than 7
				//otherwise above if statements would not have trigger
				System.out.println("num is not less than 7 and colour is blue");
			}
		} else {
			System.out.println("Num is greater than 7 and colour is not blue");
		}

	}
	
	

}
