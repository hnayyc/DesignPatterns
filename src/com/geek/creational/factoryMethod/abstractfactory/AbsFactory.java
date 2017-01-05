package com.geek.creational.factoryMethod.abstractfactory;

import com.geek.creational.factoryMethod.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
