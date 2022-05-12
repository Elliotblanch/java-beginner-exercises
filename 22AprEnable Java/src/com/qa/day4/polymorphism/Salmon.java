package com.qa.day4.polymorphism;

public class Salmon extends Fish {

	private int distanceSwam;

	public Salmon(String colour, int distanceSwam) {
		super(colour);
		this.distanceSwam = distanceSwam;
	}
	
	public String dive() {
		return "This isn't Smash Bros!";
	}

	public int getDistanceSwam() {
		return distanceSwam;
	}

	public void setDistanceSwam(int distanceSwam) {
		this.distanceSwam = distanceSwam;
	}

	
}
