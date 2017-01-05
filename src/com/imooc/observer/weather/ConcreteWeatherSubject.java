package com.imooc.observer.weather;

/**
 * 具体的目标对象，负责把有关状态存入相应的观察者对象中。
 * @author YangCheng
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {

	// 目标对象的状态
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	// （拉模型）
	public void setWeatherContent(String weatherContente) {
		this.weatherContent = weatherContent;
		// 内容有了，说明天气更新了，通知所有的订阅的人。
		this.notifyObservers();
	}
	
	// （推模型）
//	public void setWeatherContent(String weatherContente) {
//		this.weatherContent = weatherContent;
//		// 内容有了，说明天气更新了，通知所有的订阅的人。
//		this.notifyObservers(weatherContent);
//	}
}
