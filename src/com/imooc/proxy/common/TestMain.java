package com.imooc.proxy.common;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Car car = new Car();
//		car.move();
		
		// 使用继承方式
//		Moveable m = new Car2();
//		m.move();
		
		// 使用聚合方式实现
//		Car car = new Car();
//		Moveable m = new Car3(car);
//		m.move();
		
		
		// 聚合实现静态代理
		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy  clp = new CarLogProxy(ctp);
		clp.move();
	}

}
