package com.geek.creational.factoryMethod.abstractfactory;

import com.geek.creational.factoryMethod.pizza.NYCheesePizza;
import com.geek.creational.factoryMethod.pizza.NYPepperPizza;
import com.geek.creational.factoryMethod.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
