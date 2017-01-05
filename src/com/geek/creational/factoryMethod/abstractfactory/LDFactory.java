package com.geek.creational.factoryMethod.abstractfactory;

import com.geek.creational.factoryMethod.pizza.LDCheesePizza;
import com.geek.creational.factoryMethod.pizza.LDPepperPizza;
import com.geek.creational.factoryMethod.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
