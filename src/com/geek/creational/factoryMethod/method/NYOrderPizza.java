package com.geek.creational.factoryMethod.method;

import com.geek.creational.factoryMethod.pizza.CheesePizza;
import com.geek.creational.factoryMethod.pizza.GreekPizza;
import com.geek.creational.factoryMethod.pizza.NYCheesePizza;
import com.geek.creational.factoryMethod.pizza.NYPepperPizza;
import com.geek.creational.factoryMethod.pizza.PepperPizza;
import com.geek.creational.factoryMethod.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
