package com.imooc.proxy.dynamicProxy.jdkPrinciple;

import java.lang.reflect.Method;

public interface InvocationHandler {

	public void invoke(Object o, Method m);
}
