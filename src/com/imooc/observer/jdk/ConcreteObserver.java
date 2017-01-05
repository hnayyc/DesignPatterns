package com.imooc.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	// 观察者名称变量
	private String observerName;
	
	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	/**
	 * 参数：
	 * o : 拉模式使用参数
	 * arg : 推模式使用参数
	 */
	@Override
	public void update(Observable o, Object arg) {
		// 第一种：推模式
		System.out.println(observerName + "收到了消息，目标推送过来的是：" + arg);
		
		// 第二种：拉模式
		System.out.println(observerName + "收到了消息，主动到目标对象中拉，拉的内容是：" + ((ConcreteWeatherSubject)o).getContent());
	}

}
