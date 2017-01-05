package com.imooc.observer.advance;

public class ConcreteWeatherSubject extends WeatherSubject {

	// "晴天" "下雨" "下雪"
	// 目标对象的状态
	private String weatherContent;
	
	@Override
	protected void notifyObservers() {
		
		for(Observer observer : observers) {
			// 规则是：
			// 黄明女友：需要“下雨”的条件通知，其他的条件不通知
			// 黄明老妈：需要“下雨”或“下雪”的条件通知，其他的条件不通知

			// 如果天气是晴天，do nothing...
			// 如果天气是下雨
			if("下雨".equals(this.getWeatherContent())) {
				if("黄明女友".equals(observer.getObserverName())) {
					observer.update(this);
				}
				
				if("黄明老妈".equals(observer.getObserverName())) {
					observer.update(this);
				}
			}
			
			// 如果天气是下雪
			if("下雪".equals(this.getWeatherContent())) {
				if("黄明老妈".equals(observer.getObserverName())) {
					observer.update(this);
				}
			}
		}
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}
}
