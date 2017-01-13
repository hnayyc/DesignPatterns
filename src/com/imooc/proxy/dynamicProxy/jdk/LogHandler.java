package com.imooc.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

	private Object target;
	
	public LogHandler(Object target) {
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
		
		System.out.println("[Log]汽车开始行驶日志");
		
		method.invoke(target);
		
		System.out.println("[Log]汽车结束行驶日志");
		
		return null;
	}
}
