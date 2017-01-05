package com.imooc.proxy.common;


public class CarLogProxy implements Moveable {
	
	private Moveable m;   // 通过把Car作为内部属性的聚合方式，实习那对Car的代理。
	
	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("[Time]汽车开始行驶......");
		
		m.move();
		
		long endtime = System.currentTimeMillis();
		System.out.println("[Time]汽车行结束行使...... 汽车行驶时间：" + (endtime - starttime) + "毫秒！");
	}
}
