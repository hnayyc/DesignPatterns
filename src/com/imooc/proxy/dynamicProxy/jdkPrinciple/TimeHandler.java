package com.imooc.proxy.dynamicProxy.jdkPrinciple;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}
	
	@Override
	public void invoke(Object o, Method m) {
		try {
			long starttime = System.currentTimeMillis();
			System.out.println("[Log]汽车开始行驶日志");
			
			m.invoke(target);
			
			long endtime = System.currentTimeMillis();
			System.out.println("[Log]汽车结束行驶日志");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
