package com.qa.day3.arrays;

import java.util.ArrayList;

public class ArrayListDemo {
	
	// ArrayLists are a type of colloection (java data organiser class)
	// ArrayLists are mutable, they are resizable
	// Has a bunch of simple inbuilt methods for changing & updating the data
	
	public static void arrayListDemo() {
		
		// Datatype - Arraylist<type of data>
		//name of arraylist
		// = new Arraylist<>();
		ArrayList<String> pizzaList = new ArrayList<>();
		
		//System.out.println(pizzaList);
		
		// If I want to add data to my list I use .add()
		pizzaList.add("pepperoni");
		pizzaList.add("Margharita");
		pizzaList.add("Quattro Frommagi");
		pizzaList.add("Pizza Bianca");
		
		System.out.println(pizzaList);
		
		//.get
		System.out.println(pizzaList.get(0));
		
		// .set() - used to update values
		pizzaList.set(3, "Pizza Roma");
		
		// .remove -removes an element from the list
		pizzaList.remove(3);
		
		// .size() -length of the arraylist
		System.out.println(pizzaList.size());
		
		System.out.println("================");
		
		// Standard for loop
		for(int x = 0; x < pizzaList.size(); x++) {
			System.out.println(pizzaList.get(x));
		}
		
		System.out.println("================");
		
		
		// Enhanced for Loop - Assumes you are making a variable starting at 0
		// increasing by 1, and running until you finish the loop
		// for(Datatype - temp variable : arrayListName)
		for(String pizza : pizzaList) {
			System.out.println(pizza); // Print out the value of each variable assuming it's a string
		}
		
		
		// .clear() - clears the arraylist
		pizzaList.clear();
		
		
	}

}
