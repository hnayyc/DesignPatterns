package com.geek.behavioral.templateMethod.hotdrink;

public class MainTest {
	public static void main(String[] args) {
	
		HotDrink mCoffee=new Coffee() ;
		TeaWithHook mTeaWithHook=new TeaWithHook();
		//mCoffee.prepareRecipe();
		mTeaWithHook.prepareRecipe();
	}
}

