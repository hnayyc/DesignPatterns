package com.imooc.proxy.staticProxy;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 普通方法实现记录汽车行驶时间，未采用代理模式。
//		Car car = new Car();
//		car.move();
		
		staticProxy();
		dynamicProxy();
	}
	
	public static void staticProxy() {
		// 使用继承方式
//		Moveable m = new Car2();
//		m.move();
		
		// 使用聚合方式实现
//		Car car = new Car();
//		Moveable m = new Car3(car);
//		m.move();
		
		Car car = new Car();
		System.out.println("代理顺序一：先记录日志，后记录时间。");
		CarTimeProxy timeProxy1 = new CarTimeProxy(car);
		CarLogProxy logProxy1= new CarLogProxy(timeProxy1);
		logProxy1.move();
		System.out.println("代理顺序二：先记录时间，后记录日志。");
		CarLogProxy logProxy2= new CarLogProxy(car);
		CarTimeProxy timeProxy2 = new CarTimeProxy(logProxy2);
		timeProxy2.move();
		
		// 课后作业：如果需要对火车、汽车、自行车三个都进行代理，如何统一实现？
	}
	
	public static void dynamicProxy() {
		
	}

}
