package com.qa.day4.inheritance;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Penguin pingu = new Penguin("black and white", "fish", 12, 7);
		Eagle edgar = new Eagle("brown", "rodents", 25, 21);
		// ctrl + space after writing Class name will add values
		BaldEagle john = new BaldEagle("white", "demoxynel", 23, 253, 12);
		
		System.out.println(pingu.layEgg());
		System.out.println(pingu.getFeatherColour());
		System.out.println(pingu.swim());
		System.out.println(edgar.fly());
		System.out.println(edgar.screech());
		System.out.println(john.screech());
//		System.out.println(pingu.screech()); // Method is specific to Eagle, penguin can't Screech
		

	}

}
