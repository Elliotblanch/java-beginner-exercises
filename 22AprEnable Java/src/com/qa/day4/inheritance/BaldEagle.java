package com.qa.day4.inheritance;

public class BaldEagle extends Eagle {
	
	private int baldSpot;
	
	public String toupee() {
		return "What bald spot?";
	}
	
	public String screech() {
		return "CACAW XD";
	}

	public BaldEagle(String featherColour, String diet, int wingspan, int miceEaten, int baldSpot) {
		super(featherColour, diet, wingspan, miceEaten);
		this.baldSpot = baldSpot;
	}

	public int getBaldSpot() {
		return baldSpot;
	}

	public void setBaldSpot(int baldSpot) {
		this.baldSpot = baldSpot;
	}

}
