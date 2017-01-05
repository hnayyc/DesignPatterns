package com.imooc.proxy.jdkImpl;

import java.util.Random;

/**
 * 普通实现方法，没有使用代理模式。
 */
public class Car implements Moveable {

	@Override
	public void move() {
		
		long starttime = System.currentTimeMillis();
		System.out.println("[Car]汽车开始行驶......");
		
		//实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("[Car]汽车行驶中......");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long endtime = System.currentTimeMillis();
		System.out.println("[Car]汽车行结束行使...... 汽车行驶时间：" + (endtime - starttime) + "毫秒！");
	}

}
