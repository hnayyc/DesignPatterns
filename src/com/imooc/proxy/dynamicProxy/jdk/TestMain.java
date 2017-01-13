package com.imooc.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMain {

	/**
	 * JDK动态代理
	 * 1 只能代理实现了Interface（接口）的类
	 * 2 没有实现接口的类不能实现JDK的动态代理
	 */
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler timeHandler = new TimeHandler(car);
		Class<?> cls = car.getClass();
		
		/**
		 * loader : 类加载器
		 * interfaces : 实现接口
		 * h : InvocationHandler
		 * 
		 * 动态代理实现思路
		 * 实现功能：通过Proxy的newProxyInstance返回代理对象
		 * 1 生命一段源码（动态产生代理）；
		 * 2 便宜源码（JDK Complier API），产生新的类（代理类）；
		 * 3 将这个类load到内存当中，产生一个新的对象（代理对象）；
		 * 4 return代理对象。
		 */
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(), 
				cls.getInterfaces(), timeHandler);
		m.move();
		
		System.out.println("JDK动态代理类的名字 : " + m.getClass().getName());
	}
}

/**
 * 习题：
 * 
 * 代理Car类，可以打印time和log两个功能。
 */