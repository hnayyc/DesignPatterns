package com.imooc.proxy.common;

/**
 * 通过聚合的方式实现静态代理
 */
public class CarAggregationProxy implements Moveable {

	private Car car;   // 通过把Car作为内部属性的聚合方式，实习那对Car的代理。
	
	public CarAggregationProxy(Car car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("[Car3]汽车开始行驶......");
		
		car.move();
		
		long endtime = System.currentTimeMillis();
		System.out.println("[Car3]汽车行结束行使...... 汽车行驶时间：" + (endtime - starttime) + "毫秒！");
	}
	

}
