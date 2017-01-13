package com.imooc.proxy.dynamicProxy.jdk;

import java.util.Random;

/**
 * 普通实现方法，没有使用代理模式。
 */
public class Car implements Moveable {

	@Override
	public void move() {
		
		//实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("[Car]汽车行驶中......");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
