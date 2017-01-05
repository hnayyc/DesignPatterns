package com.imooc.observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，他知道观察他的观察者，并提供注册（添加）和删除观察者的接口。
 * @author YangCheng
 *
 */
public class Subject {

	// 用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	
	// attach detach notifyObserver
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * 删除集合中的指定观察者
	 * @param observer
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * 通知所有注册的观察者对象
	 * 只有子类可以访问，所以定义为protected权限
	 */
	protected void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}
}
