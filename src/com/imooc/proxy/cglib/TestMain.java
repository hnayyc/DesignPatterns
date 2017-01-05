package com.imooc.proxy.cglib;

public class TestMain {

	
	/**
	 * CGLIB动态代理
	 * 1  针对Class（类）来实现代理
	 * 2 对指定目标类产生一个子类，通过方法拦截技术拦截所有父类方法的调用。
	 */
	public static void main(String[] args) {

		CglibProxy proxy = new CglibProxy();
		Train train = (Train)proxy.getProxy(Train.class);
		train.move();
	}

}
