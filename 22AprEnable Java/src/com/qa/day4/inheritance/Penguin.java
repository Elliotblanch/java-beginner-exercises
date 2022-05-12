package com.qa.day4.inheritance;

//Inherit the attributes and Methods from it's parent class (Bird)
// Needs a constructor that takes in the same values as the parent class

public class Penguin extends Bird { // extends parentClass
	
	private int fishEaten;
	
	public String swim() {
		return "Just keep swimming";
	
	}
	
	
	// Constructor takes in the Bird values & added Penguin values
	public Penguin(String featherColour, String diet, int wingspan, int fishEaten) {
		// super() reffers to the parent class
		super(featherColour, diet, wingspan);
		this.fishEaten = fishEaten;
	}

	public int getFishEaten() {
		return fishEaten;
	}

	public void setFishEaten(int fishEaten) {
		this.fishEaten = fishEaten;
	}
	
	
}
