package com.imooc.proxy.common;


/**
 * 通过继承方式实现静态代理，Car2对Car的代理。
 */
public class CarInheritProxy extends Car {
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("[Car2]汽车开始行驶......");
		
		super.move();

		long endtime = System.currentTimeMillis();
		System.out.println("[Car2]汽车行结束行使...... 汽车行驶时间：" + (endtime - starttime) + "毫秒！");
	}

}
