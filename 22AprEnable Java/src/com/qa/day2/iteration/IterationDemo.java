package com.qa.day2.iteration;

public class IterationDemo {
	
	// Iteration is the process of running a block of code multiple times
	// Large set of data, run the same function across each piece of data
	// Often we will need to do the same command to multiple pieces of data
	// Rather than writing one method 100x, write it once
	
	public static void whileDemo() {
		
		// Three different main types of loop
		// While - Checks a query, if it is true, it does something until query is false
		// Do While - Does something, then checks if the query is true, and will keep repeating
		// For Loop - Does something for a known amount of loops
		
		int counter = 0;
		
		System.out.println("Before starting loop");
		// While the value of counter is less than 10
		while(counter < 10) {
			counter += 1; //increments counter by 1
			System.out.println("counter: " + counter);
		}
		System.out.println("-------------loop end--------------");
		
		// All loops follow some type of numerical query to keep looping around
	}
	
	public static void doWhileDemo() {
		
		// Do while loops will always run the command once, then check the query
		
		boolean query = false;
		
		do {
			System.out.println("This will always run!");
		} while(query); // query == true
		
		int hoursLeft = 10;
		
		do {
			System.out.println("Hours left before end: " + hoursLeft);
			hoursLeft -=1;
		} while (hoursLeft > 0);
	}
	
	//for loop
	public static void forLoopDemo() {
		
		
		// Loops through a block of code for a predetermined amount of time
		// Initialisation - the initial value to set
		// condition - the query we are waiting for to stop the loop
		// iterator - how we are changing our counting value
		// command - what the loop is doing
		
		// Basic for loop that counts from 1-10
		for(int i = 0; i <= 10; i++) { // i += 1 == i++
			System.out.println(i);
		}
		
		// For loop to count down from 10 to 4
		for(int x = 10; x >= 4; x--) {
			System.out.println(x);
		}
		
		//For loop to count up in larger increments
		
		for(float j = 7; j < 234; j += 11.02f) {
			System.out.println("Value of J: " + j);
		}
		for (int l = 2; l <= 15; l +=2) {
			if(l == 6) {
				System.out.println("Value of L is 6!");
			} else {
			System.out.println(PrintClass.helloThere(l));
			}
		}
	
	}
	

}
