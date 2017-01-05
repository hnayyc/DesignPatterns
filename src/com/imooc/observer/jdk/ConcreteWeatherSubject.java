package com.imooc.observer.jdk;

import java.util.Observable;

// 天气目标的具体实现类
public class ConcreteWeatherSubject extends Observable {

	// 天气情况的内容
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
		// 天气情况有了，就要通知所有的观察者
		// 注意：在通知之前，在用Java的Observer模式的时候，下面这句话必不可少。
		this.setChanged();
		
		// 然后主动通知
		this.notifyObservers(content); // 推模式
		// this.notifyObservers(); // 拉模式
	}
	
	
}
