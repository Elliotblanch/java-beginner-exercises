package com.qa.day4.oopRecap;

public class Drink {

	// our drink methods and variables are not static
	
	// Variables for our attributes
	public String type;
	public float cost;
	public boolean dairyfree;
	public int calories;
	
	// Static variable - This is the same across ALL OBJECTS OF THIS CLASS
	// This variable doesn't go into the constructor as it already has a value
	public static String cupColour = "white";
	
	// Constructor - Method to create our object
	// Shift + alt + s OR right click -> source -> generate constructor using fields
	// Always make constructors automatically to save time, and ensure accuracy
	
	public Drink(String type, float cost, boolean dairyfree, int calories) {
		super(); // Telling java we want to create this in the default way
		this.type = type;
		this.cost = cost;
		this.dairyfree = dairyfree;
		this.calories = calories;
	}

	// toString - When we system out, gives us the values rather than the id reference
	// Also made with Shift + alt + s
	
	@Override
	public String toString() {
		return "Drink [type=" + type + ", cost=" + cost + ", dairyfree=" + dairyfree + ", calories=" + calories + "]";
	}
	
	
	
}
