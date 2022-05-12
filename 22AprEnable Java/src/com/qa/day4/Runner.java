package com.qa.day4;

import com.qa.day4.oopRecap.Cafe;
import com.qa.day4.oopRecap.Drink;

public class Runner {
	
	// We are not making an object of our runner, so main is static
	public static void main(String[] args) {
		Drink latte = new Drink("latte", 3.19f, true, 321);
		Drink tea = new Drink("English Tea", 2.35f, true, 103);
	
	System.out.println(latte);
	
	// Our class is trying to run an instanced method (Can't do)
	// We need to create an object of our cafe, to run our methods
	// Drink objects have a datatype of Drink
	// Cafe objects have a datatype of Cafe
	
	Cafe baseCafe = new Cafe(); //making a new cafe called baseCafe
	
	//replace cafe with baseCafe
	baseCafe.addOrder(tea);
	baseCafe.addOrder(latte);
	baseCafe.addOrder(new Drink ("Mocha", 3.51f, false, 480)); 
	// We can't reuse this object, there is no variable to access
	
	System.out.println(baseCafe.getAllOrders());
	
	// Static and Instanced
	// Within Java all methods and variables are either static or instanced
	// If something is not static, it is instanced (default)
	// Instanced = Each 'instance' (unique object) uses the same methods / attributes, but are not connected
	
	// our drinks have different calorie values
	System.out.println(latte.calories);
	System.out.println(tea.calories);
	
	latte.calories = 500; //This won't change the calories of our tea
	System.out.println(tea.calories);
	
	System.out.println("================");
	// Accessing a static variable from an object is bad practice
	System.out.println(tea.cupColour); 
	System.out.println(tea.cupColour);
	latte.cupColour = "red"; //Changing the cupcolour value of the latte object
	System.out.println(tea.cupColour); 
	System.out.println(tea.cupColour);
	
	//As cupcolour is a static variable, it changes for all objects of this class
	//changing the static variable via a class is good practice
	Drink.cupColour = "Orange"; // Drink = Class
	System.out.println(latte.cupColour);
	System.out.println(tea.cupColour);
	
	// access an instanced variable from a calss
	//Drink.calories = 100; // A class cannot access instanced methods / variables
	
	}

}
