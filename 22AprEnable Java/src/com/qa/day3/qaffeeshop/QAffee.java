package com.qa.day3.qaffeeshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QAffee {
	public static ArrayList<String> qaffeeList = new ArrayList<>();
	
	
	public static boolean addOrder(String x) {
		//Methods should always return something, to make testing easier
		return qaffeeList.add(x);
		
	}
	
	public static String returnOrder(int x) {
		return qaffeeList.get(x);
	}
	
	public static String modOrder(int x, String y) {
		return qaffeeList.set(x, y);
		
	}
	
	public static String delOrder (int x) {
		return "Removed" + qaffeeList.remove(x);
	}
	
	
	//returns our orders arraylist
	public static void printOrders() {
		Collections.sort(qaffeeList);
		for(String order : qaffeeList) {
			System.out.println(order);
		}
		Collections.sort(qaffeeList);
	}
	
	public static boolean clearAll() {
		qaffeeList.clear();
		return true;
	}

}
