package com.qa.day1;

public class DataTypes {

	public static char printA() {
		return 'A';
	}
	
	public static boolean printTrue() {
		return true;
	}
	
	public static float printFloat() {
		return 3.14f;
	}
	
	public static long printLong() {
		return 31344554L;
	}
	
	public static double printDouble() {
		return 2390934.103098d;
	}
	
	public static double forceReturn() {
		return 10;
	}
	
	//a float can not easily be returned as an int
	public static int forceCasting ( ) {
		return (int) 13.82f; //converts float into an int
	}
}
