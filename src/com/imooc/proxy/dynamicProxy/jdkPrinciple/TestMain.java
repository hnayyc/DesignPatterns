package com.imooc.proxy.dynamicProxy.jdkPrinciple;

public class TestMain {

	
	/**
	 * 动态代理实现思路
	 * 实现功能：通过Proxy的newProxyInstance返回代理对象
	 * 1 生命一段源码（动态产生代理）；
	 * 2 便宜源码（JDK Complier API），产生新的类（代理类）；
	 * 3 将这个类load到内存当中，产生一个新的对象（代理对象）；
	 * 4 return代理对象。
	 * 
	 */
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class, h);
		m.move();
	}

}
