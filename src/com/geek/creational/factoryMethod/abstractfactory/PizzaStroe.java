package com.geek.creational.factoryMethod.abstractfactory;

public class PizzaStroe {
	public static void main(String[] args) {
		OrderPizza mOrderPizza;
		mOrderPizza=new	OrderPizza(new LDFactory());
	}
}
