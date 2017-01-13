package com.imooc.proxy.staticProxy;


public class CarLogProxy implements Moveable {
	
	// 此处使用interface作为变量，所以可以这么立即：所谓“代理”，是对某个或某几个功能的代理，侧重于功能。
	private Moveable m;   // 通过把Car作为内部属性的聚合方式，实习那对Car的代理。
	
	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}
	
	@Override
	public void move() {
		System.out.println("[Log]汽车开始行驶日志");
		
		m.move();
		
		System.out.println("[Log]汽车结束行驶日志");
	}
}
