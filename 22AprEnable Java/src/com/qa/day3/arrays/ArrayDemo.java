package com.qa.day3.arrays;

public class ArrayDemo {

	// Arrays are complex data types that store multiple values as a single variable
			// An array (in Java) can only store one data type (array of ints, chars, floats etc...)
			// Strings are arrays of chars
			
			// Arrays in java are immutable, they cannot change length, size or change the type of data they store
			
			public static void arrayExample() {
				
				//make an array of fruits (String)
				//Data type of variable [] arrayName = {"array", "contents"};
				String[] fruitArray = {"kiwi", "melon", "banana", "grape", "rambuton", "Mango"};
				
				// Prints out the reference to the memory of this object
				System.out.println(fruitArray);
				
				// Indexing - ordering and grabbing values from an array
				// Index numbers start from 0 and go up from there
				//
				System.out.println(fruitArray[0]);
				
				
				fruitArray[3] = "blueberry";
				System.out.println(fruitArray[3]);
				
				System.out.println("===================");
				
				for (int i = 0; i < 6; i++) {
					System.out.println(fruitArray[i]);
				}
				
				//using fruitarray.length we can list the amount of elements in this array
				System.out.println(fruitArray.length);
				
				System.out.println("===================");
				
				// And we can use that in the loop to automatically adjust for changes
				for (int i = 0; i < fruitArray.length; i++) {
					System.out.println(fruitArray[i]);
				}
				
			}
}
