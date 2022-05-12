package com.qa.day2;

import com.qa.day2.conditionals.CommunityExercise;
import com.qa.day2.conditionals.Demo;
import com.qa.day2.conditionals.Intermediate;
import com.qa.day2.iteration.IterationDemo;
import com.qa.day2.iteration.IterationExercise;
import com.qa.day2.parameter.BasicCalculator;

public class Runner {
	
	//to make my old method instanced, jsut remove the word 'static'
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(BasicCalculator.returnGreeting("Elliot", "morning"));
		//System.out.println("=====================");
		// BasicCalculator output
		//System.out.println(BasicCalculator.addSum(4, 3, 2));
		//System.out.println(BasicCalculator.subSum(7, 2));
		//System.out.println(BasicCalculator.multSum(5, 10));
		//System.out.println(BasicCalculator.divSum(50, 0));
		//System.out.println(BasicCalculator.squareSum(3));
		//System.out.println(BasicCalculator.raisePower(3,4));
		//System.out.println(BasicCalculator.oddEven(4));
		//System.out.println("======================");
		//System.out.println(BasicCalculator.multFive(5));
		//Demo.basicExample();
		//Demo.nestingIfElse();
		//System.out.println("======================");
		//Intermediate.complexIfElse(6, "blue");
		//CommunityExercise.fizzBuzz(15);
		//CommunityExercise.blackJack(19, 16);
		//CommunityExercise.uniqueSum(2, 3, 2);
		//com.qa.day2.iteration.IterationDemo.whileDemo();
		//IterationDemo.doWhileDemo();
		//IterationExercise.moneySpend(2000, 120, 0);
		//IterationDemo.forLoopDemo();
		//IterationExercise.chartExerciseOne(0);
		//IterationExercise.charExerciseTwo(0);
		//IterationExercise.countExerciseOne(0, 0);
		//IterationExercise.countExerciseTwo(0, 0, 0);
		//IterationExercise.coinExercise(20.53f, 25f);
public static void main (String[] args) {
	
	//Before we can run methods from Intermediate, e need an object
	//Intermediate demo = new Intermediate();
	// Running the methods of the Objects
	//demo.boolDemo(false);
	//demo.complexIfElse(7, "red");
	
	BasicCalculator Calc = new BasicCalculator();
	System.out.println(Calc.addSum(2, 3, 5));
	
	//BiggerDemo.boolDemo(true); //Won't work, because the methods are instanced
	}

}
