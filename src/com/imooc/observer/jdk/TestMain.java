package com.imooc.observer.jdk;

public class TestMain {

	public static void main(String[] args) {
		// 创建一个天气目标，也可以说是被观察者（发布者）。
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		
		// 创建黄明女友作为观察者
		ConcreteObserver girl = new ConcreteObserver();
		girl.setObserverName("黄明女友");
		
		// 创建黄明老妈作为观察者
		ConcreteObserver  mum = new ConcreteObserver();
		mum.setObserverName("黄明老妈");
		
		// 注册观察者
		subject.addObserver(girl);
		subject.addObserver(mum);
		
		// 目标更新天气情况
		subject.setContent("天气晴，气温28度。");
	}
}
