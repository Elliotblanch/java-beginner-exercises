package com.qa.day4.inheritance;

public class Bird {
	
	private String featherColour;
	private String diet;
	private int wingspan;
	
	// Basic methods birds can do
	public String layEgg() {
		return "Laying an egg";
	}
	
	public String walk() {
		return "Waling around";
	}
	
	// Constructor
	public Bird(String featherColour, String diet, int wingspan) {
		// Uses default object class
		super();
		this.featherColour = featherColour;
		this.diet = diet;
		this.wingspan = wingspan;
	}
	
	// Getters & Setters
	public String getFeatherColour() {
		return featherColour;
	}

	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}
	
	

	
	
}
