package com.qa.day3;

import com.qa.day3.arrays.ArrayDemo;
import com.qa.day3.arrays.ArrayExercise;
import com.qa.day3.arrays.ArrayListDemo;
import com.qa.day3.objects.Cake;
import com.qa.day3.objects.SongObject;
import com.qa.day3.qaffeeshop.Drink;
import com.qa.day3.qaffeeshop.QAffee;

public class Runner {
	
	public static void main(String[] args) {
		
		//ArrayDemo.arrayExample();
		//ArrayExercise.colourExercise();
		//ArrayListDemo.arrayListDemo();
		
//		QAffee.addOrder("Flat White");
//		QAffee.addOrder("Mocha");
//		QAffee.addOrder("Flat White");
//		QAffee.addOrder("Capuccino");
//		QAffee.addOrder("Earl Gray Tea");
//		QAffee.returnOrder(0);
//		QAffee.modOrder(0, null);
//		QAffee.delOrder(0);
//		QAffee.printOrders();
//		QAffee.clearAll();
		
		//make a cake object and print it out
		// Cake - Data type
		// newCake - name of the variable
		// When making a scanner/arrayList we are making a new object
//		Cake newCake = new Cake(true, 4, 19.99f, "lilac");
//		System.out.println(newCake);
//		System.out.println(newCake.colour);
//		System.out.println(newCake.vegan);
			
//		Cake newerCake = new Cake(false, 3, 12.99f, "Turqoise");
//		System.out.println(newerCake.colour);
		
//		SongObject seaDragon = new SongObject("Covet", 5.33f, false, 9);
//		SongObject yas = new SongObject("Polyphia", 3.22f, false, 10);
//		System.out.println(seaDragon.artist);
//		System.out.println(seaDragon.vocals);
//		System.out.println(seaDragon.rating);
		
//		seaDragon.rating = 8;
//		System.out.println(seaDragon.rating);
		
		Drink hotChocolate = new Drink("Hot Chocolate", 3.25f, true, 342);
		System.out.println(hotChocolate);
		
		
	
	
	}

}
