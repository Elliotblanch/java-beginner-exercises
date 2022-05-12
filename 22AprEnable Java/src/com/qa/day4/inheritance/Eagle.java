package com.qa.day4.inheritance;

public class Eagle extends Bird {
	
	private int miceEaten;
	
	// Method
	public String screech () {
		return "CACAW";
	}
	
	public String fly() {
		return "Soaring with all " + getWingspan() + " inches of wing"; 
	}

	public Eagle(String featherColour, String diet, int wingspan, int miceEaten) {
		super(featherColour, diet, wingspan);
		this.miceEaten = miceEaten;
	}

	public int getMiceEaten() {
		return miceEaten;
	}

	public void setMiceEaten(int miceEaten) {
		this.miceEaten = miceEaten;
	}
	
	

}
