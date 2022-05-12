package com.qa.day2.conditionals;

public class Demo {

	//Conditionals are methods of branching our code dependent on input value
	//IF ELSE statements - take in a query, and do something dependant on the query
	
	public static void basicExample() {
		
		//method that turns kettle off if water is boiling
		boolean kettleOn = true;
		int waterTemp = 50;
		
		//Statement to check if water temp is higher than 90
		if(waterTemp > 90) { //if water temp is higher than 90
			kettleOn = false; //turn the kettle off
			System.out.println("Print me if the if statement triggers!");
		} else //code in the else {} block runs after the if{} block IF the query isn't true
			System.out.println("Kettle isn't boiled yet");
		
		//print out the value of kettle
		System.out.println("The kettle is on:" + kettleOn);
	}
	
	public static void nestingIfElse() {
		
		//Simple if else is either true or false
		boolean tails = true;
		
		//When checking the exact value use ==
		if (tails == true) {
			System.out.println("Tails wins!");
		} else {
			System.out.println("Heads wins!");
		}
 //If else statement to check what day it is
	String day = "Tue";
			
	if (day == "Mon") {
		System.out.println("it's Monday");
	} else if (day == "Tue") {
		System.out.println("It's Tuesday");
	} else if (day == "Wed") {
		System.out.println("It's Wednesday");
	} else if (day == "Thu") {
		System.out.println("It's Thursday");
	} else if (day == "Fri") {
		System.out.println("It's Friday");
	} else {
		System.out.println("It's the weekend");
	}
}
	
	
}
