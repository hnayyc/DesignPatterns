package com.imooc.proxy.staticProxy;

public class CarTimeProxy implements Moveable {
	
	// 此处使用interface作为变量，所以可以这么立即：所谓“代理”，是对某个或某几个功能的代理，侧重于功能。
	private Moveable m;   // 通过把Car作为内部属性的聚合方式，实习那对Car的代理。
	
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("[Time]汽车开始行驶.....");
		
		m.move();
		
		long endtime = System.currentTimeMillis();
		System.out.println("[Time]汽车行结束行使...... 汽车行驶时间：" + (endtime - starttime) + "毫秒！");
	}
}
