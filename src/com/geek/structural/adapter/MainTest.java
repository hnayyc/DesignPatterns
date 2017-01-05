package com.geek.structural.adapter;

import com.geek.structural.adapter.adapter.TurkeyAdapter;
import com.geek.structural.adapter.adapter.TurkeyAdapter2;
import com.geek.structural.adapter.duck.Duck;
import com.geek.structural.adapter.duck.GreenHeadDuck;
import com.geek.structural.adapter.turkey.WildTurkey;



public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck=new GreenHeadDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		Duck duck2turkeyAdapter=new TurkeyAdapter2();
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();
		
	
	}
}
