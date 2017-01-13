package com.imooc.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	// 被代理的对象
	private Object target;
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}
	
	/**
	 * 参数
	 * proxy : 被代理对象
	 * method : 被代理对象的方法
	 * args : 方法的参数
	 * 
	 * 返回值：
	 * Object 方法的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		long starttime = System.currentTimeMillis();
		System.out.println("[JDK-Time]汽车开始行驶......");
		
		method.invoke(target);
		
		long endtime = System.currentTimeMillis();
		System.out.println("[JDK-Time]汽车行结束行使...... 汽车行驶时间：" + (endtime - starttime) + "毫秒！");
		return null;
	}

}
