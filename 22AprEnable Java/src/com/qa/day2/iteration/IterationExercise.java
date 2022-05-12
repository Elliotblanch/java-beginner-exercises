package com.qa.day2.iteration;

import java.util.Random;

public class IterationExercise {
	
	public static void moneySpend(float startingMoney, int expenses, int limit) {
		
		
		while (startingMoney > limit) {
			int cost = new Random().nextInt(expenses);
			startingMoney -= cost;
			System.out.println("Funds remaining: " + startingMoney);
			
		}
		System.out.println("STOP SPENDING MONEY!");
	}
	
	public static void chartExerciseOne(int A) {
		for (A = 100; A <= 200; A++)
			System.out.println("The value of A is: " + A);
	}
	
	public static void charExerciseTwo(int A) {
		for (A = 100; A <= 200; A++)
			if (A % 2 == 0)
				System.out.println("-");
			else
				System.out.println("*");
		}
		
	public static void countExerciseOne(int x, int y) {
		for (y = 1; y <= 10; y++) {
			for (x = 1; x <= 10; x++) {
				System.out.println(x);
			}
			
		}
			
	}
	
	public static void countExerciseTwo(int x, int y, int z) {
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= x; y++) {
					System.out.println(x);
					}
		System.out.println("===========");
			
		}
		
		
	}
	
	public static void coinExercise(float cost, float moneySpent) {
		
		// Takes in a cost of an item and how much a customer spent
		// It will print out all of the change they receive in their coinage
		
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		// How much change the customer is owed
		float change = moneySpent - cost;
		
		while (change >= 50) {
			fifty++;
			change -= 50;	
		}
		
		while (change >= 20) {
			twenty++;
			change -= 20;	
		}
		
		while (change >= 10) {
			ten++;
			change -= 10;	
		}
		
		while (change >= 5) {
			five++;
			change -= 5;
		}
		
		while (change >= 2) {
			two++;
			change -= 2;	
		}
		
		while (change >= 1) {
			one++;
			change -= 1;	
		}
		
		while (change >= 0.5f) {
			fiftyPence++;
			change -= 0.5f;	
		}
		
		while (change >= 0.2f) {
			twentyPence++;
			change -= 0.2f;	
		}
		
		while (change >= 0.1f) {
			tenPence++;
			change -= 0.1f;	
		}
		
		while (change >= 0.05f) {
			fivePence++;
			change -= 0.05f;	
		}
		
		while (change >= 0.02f) {
			twoPence++;
			change -= 0.02f;	
		}
		
		while (change >= 0.01f) {
			onePence++;
			change -= 0.01f;	
		}
	
	}
	
	

	
	

}
