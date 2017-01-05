package com.imooc.chainofresponsibility.handler;

public class PriceHandlerFactory {

	/**
	 * 原来： sales --> manager --> director --> VP --> CEO
	 * 
	 * 变化：sales --> lead -- >manager --> director --> VP --> CEO
	 */
	
	/**
	 * 构造责任链的工厂函数
	 * 创建PriceHandler的工厂方法
	 * @return 责任链最前端的对象
	 */
	public static PriceHandler createPriceHandler() {
		
		PriceHandler sales = new Sales();
		PriceHandler lead = new Lead();
		PriceHandler manager = new Manager();
		PriceHandler director = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		
		sales.setSuccessor(lead);
		lead.setSuccessor(manager);
		manager.setSuccessor(director);
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		return sales;
	}

}
