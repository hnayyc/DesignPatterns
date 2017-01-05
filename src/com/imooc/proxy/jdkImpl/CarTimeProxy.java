package com.imooc.proxy.jdkImpl;

public class CarTimeProxy implements Moveable {
	
	private Moveable m;   // 通过把Car作为内部属性的聚合方式，实习那对Car的代理。
	
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("[Log]汽车开始行驶日志");
		
		m.move();
		
		long endtime = System.currentTimeMillis();
		System.out.println("[Log]汽车结束行驶日志");
	}
}
