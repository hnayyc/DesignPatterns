package com.geek.creational.factoryMethod.method;

import com.geek.creational.factoryMethod.pizza.CheesePizza;
import com.geek.creational.factoryMethod.pizza.GreekPizza;
import com.geek.creational.factoryMethod.pizza.LDCheesePizza;
import com.geek.creational.factoryMethod.pizza.LDPepperPizza;
import com.geek.creational.factoryMethod.pizza.PepperPizza;
import com.geek.creational.factoryMethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
