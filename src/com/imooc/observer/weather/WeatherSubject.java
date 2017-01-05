package com.imooc.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，他知道观察他的观察者，并提供注册（添加）和删除观察者的接口。
 * @author YangCheng
 *
 */
public class WeatherSubject {

	// 用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	
	// attach detach notifyObserver
	
	/**
	 * 把订阅天气的人添加到订阅列表中
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * 删除集合中的指定订阅天气的人
	 * @param observer
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * 通知所有已经订阅天气的人
	 * 只有子类可以访问，所以定义为protected权限
	 * （拉模型）
	 */
	protected void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}
	
	
	/**
	 * 通知所有已经订阅天气的人
	 * 只有子类可以访问，所以定义为protected权限
	 * （推模型）
	 */
//	protected void notifyObservers(String content) {
//		for(Observer observer : observers) {
//			observer.update(content);
//		}
//	}
}
