package com.qa.day3.qaffeeshop;

import java.util.ArrayList;

public class QAffeeLunch {
	public static ArrayList<String> lunchList = new ArrayList<>();
	
	public static void addOrder(String x) {
		lunchList.add(x);
	}
	
	public static void returnOrder(int x) {
		System.out.println(lunchList.get(x));
	}
	
	public static void modOrder (int x, String y) {
		lunchList.set(x, y);
	}
	
	public static void delOrder (int x) {
		lunchList.remove(x);
	}
	
	public static void printOrders () {
		for (String order : lunchList) {
			System.out.println(order);
		}
	}
	
	public static void clearAll() {
		lunchList.clear();
	}
}
