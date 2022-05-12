package com.qa.day3.arrays;

public class ArrayExercise {
	
	public static void colourExercise() {
		String [] colourArray = {"Red", "Green", "Blue", "Yellow", "Purple"};
		
		for(int x = 0; x < colourArray.length; x++)
			if (colourArray[x] == "Green") {
				System.out.println(colourArray[x] + " is my favourite colour!");
			}else
			System.out.println(colourArray[x]);
		
		colourArray[4]="Magenta";
		colourArray[3]="Amber";
		
		for(int y = 3; y < colourArray.length; y++)
			System.out.println(colourArray[y]);
	}

}
