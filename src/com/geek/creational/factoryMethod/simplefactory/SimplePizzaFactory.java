package com.geek.creational.factoryMethod.simplefactory;

import com.geek.creational.factoryMethod.pizza.CheesePizza;
import com.geek.creational.factoryMethod.pizza.GreekPizza;
import com.geek.creational.factoryMethod.pizza.PepperPizza;
import com.geek.creational.factoryMethod.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
