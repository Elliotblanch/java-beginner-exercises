package com.qa.day4.polymorphism;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// polymorphism - can the object take on multiple forms?
		
		//Salmon object an object of type Salmon
		Salmon solomon = new Salmon("pink", 2123);
		Fish frankie = new Salmon("beetroot", 1221);
		Object olberic = new Salmon("gray", 282);
		
		System.out.println(solomon.dive());
		System.out.println(((Salmon)frankie).dive());
		System.out.println(((Salmon)olberic).dive());

	}

}
