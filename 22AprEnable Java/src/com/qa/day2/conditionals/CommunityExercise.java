package com.qa.day2.conditionals;

public class CommunityExercise {

	public static void fizzBuzz(int x) {
		if (x % 3 == 0 && x % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (x % 3 == 0) {
			System.out.println("Fizz");
		} else if (x % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(x);
		}
		}
	
	public static void blackJack(int x, int y) {
		if (x > y && x < 22) {
			System.out.println(x);
		} else if (x < y && y < 22) {
			System.out.println(y);
		} else {
			System.out.println(0);
		}
	}
	
	public static void uniqueSum (int x, int y, int z) {
		if ( x != y && x != z && y != z) {
			System.out.println(x + y + z);
		} else if (x == y && x != z && y != z) {
			System.out.println(z);
		} else if ( x != y && x == z && y != z) {
			System.out.println(y);
		} else if (x != y && x != z && y == z) {
			System.out.println(x);
		} else {
			System.out.println(0);
		}
	}	
}
	