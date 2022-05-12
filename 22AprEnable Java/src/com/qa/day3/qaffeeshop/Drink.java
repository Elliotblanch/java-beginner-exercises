package com.qa.day3.qaffeeshop;

public class Drink {
	
	public String product;
	public float price;
	public boolean hot;
	public int calories;
	public Drink(String product, float price, boolean hot, int calories) {
		super();
		this.product = product;
		this.price = price;
		this.hot = hot;
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "Drink [product=" + product + ", price=" + price + ", hot=" + hot + ", calories=" + calories + "]";
	}
	
	
	
	

}
