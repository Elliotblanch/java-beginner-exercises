package com.qa.main.parameter;

public class PrintName {
	//Method that returns a String saying "Hello Name!W
	public static String returnGreeting(String name, String day) {
		//String name = "Elliot"; //name = Elliot
		//We want it to return a defined name, not just "name"
		//we do this using parameters
		//return "Hello name!";
		return "Hello " + name +" it is " + day; //name = value we want it to be
			
	}
}
