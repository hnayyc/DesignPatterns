package com.imooc.proxy.staticProxy;

// 通过聚合方式实现静态代理
public class Car3 implements Moveable {

	private Car car;
	
	public Car3(Car car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("[Car3]汽车开始形式.....");
		
		car.move();
		
		long endtime = System.currentTimeMillis();
		System.out.println("[Car3]汽车行结束行使...... 汽车行驶时间：" + (endtime - starttime) + "毫秒！");
	}

}
