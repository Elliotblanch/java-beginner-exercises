package com.qa.day1;

import com.qa.main.parameter.PrintName;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("Hello World!");
//		System.out.println("123");
		returnText(); //saves value
		System.out.println(PrintName.returnGreeting("Clive", "Monday"));
		System.out.println(PrintName.returnGreeting("Elliot", "Not Wednesday"));
		System.out.println("================");
		System.out.println(Colours.printRed());
		System.out.println(Colours.printBlue());
		System.out.println(Colours.printGreen());//prints returnText
		System.out.println(Colours.printYellow());
		
		System.out.println(Shapes.printCircle());
		System.out.println(Shapes.printTriangle());
		System.out.println(Shapes.printSquare());
		
		//String concatenation
		System.out.println(Colours.printRed()   + " " + Shapes.printSquare());
		System.out.println(Colours.printGreen() + " " + Shapes.printTriangle());
		System.out.println("=================");
		System.out.println(DataTypes.printA());
		System.out.println(DataTypes.printTrue());
		System.out.println(DataTypes.printFloat());
		System.out.println(DataTypes.printLong());
		System.out.println(DataTypes.printDouble());
		System.out.println("=================");
		System.out.println(DataTypes.forceReturn());
		System.out.println(DataTypes.forceCasting());
		System.out.println((int)DataTypes.printFloat());
	}

	public static String preWorld() {
//		System.out.println("Hello Void!");
//		System.out.println("Hello World!");
		printWorld();
		return printWorld();
	}
	
	public static String printWorld() {
		return("Hello World!");
	}
	//void=don't return anything
	//String=Text return
	public static String returnText() {
		return "Hello Everyone!";
	}
	public static int returnTwo() {
		return 1;
	}
	
}