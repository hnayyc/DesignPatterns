package com.imooc.proxy.jdkImpl;

public class TestMain {

	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class, h);
		m.move();
	}

}
