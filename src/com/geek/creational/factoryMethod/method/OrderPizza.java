package com.geek.creational.factoryMethod.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.geek.creational.factoryMethod.pizza.CheesePizza;
import com.geek.creational.factoryMethod.pizza.ChinesePizza;
import com.geek.creational.factoryMethod.pizza.GreekPizza;
import com.geek.creational.factoryMethod.pizza.PepperPizza;
import com.geek.creational.factoryMethod.pizza.Pizza;

public abstract class OrderPizza {

	public OrderPizza() {
		Pizza pizza = null;
		String ordertype;

		do {
			ordertype = gettype();
			pizza = createPizza(ordertype);

			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}

	abstract Pizza createPizza(String ordertype);

	private String gettype() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();

			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
