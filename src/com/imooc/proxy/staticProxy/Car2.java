package com.imooc.proxy.staticProxy;

// 通过继承方式实现静态代理
public class Car2 extends Car {

	@Override
	public void move() {
		
		long starttime = System.currentTimeMillis();
		System.out.println("[Car2]汽车开始形式.....");
		
		// 通过继承方式实现静态代理，可以在父类的move()方法前后插入其他操作。
		super.move();
		
		
		long endtime = System.currentTimeMillis();
		System.out.println("[Car2]汽车行结束行使...... 汽车行驶时间：" + (endtime - starttime) + "毫秒！");
	}
}
