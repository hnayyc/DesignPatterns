package com.geek.behavioral.templateMethod.hotdrink;

public class Coffee extends HotDrink{

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Brewing Coffee ");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding sugar and milk");
	}

}
