package com.imooc.observer.advance;

public class ConcreteObserver implements Observer {

	// 观察者的名称
	private String observerName;
	
	// 天气情况的内容
	private String weatherContent;  // 晴天，下雨，下雪
	
	// 提醒的内容
	private String remindThing;
	
	@Override
	public void update(WeatherSubject subject) {
		weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
		System.out.println(observerName + "收到了：" + weatherContent + "，" + remindThing);
	}

	@Override
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	@Override
	public String getObserverName() {
		return this.observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}
	
	

}