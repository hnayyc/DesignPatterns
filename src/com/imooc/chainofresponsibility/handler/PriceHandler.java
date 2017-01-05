package com.imooc.chainofresponsibility.handler;

/**
 * 价格处理人
 * 
 * 因为有个指向自身的引用，所以就不能使用interface了，用abstract class合适。
 * 
 * 责任链遵循OO的依赖倒置原则，即依赖于抽象，而非依赖于具体，达到解耦目的（客户端和责任链解耦）。
 */
public abstract class PriceHandler {

	/**
	 * 直接后继，用于传递请求
	 */
	protected PriceHandler successor;

	public PriceHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	/**
	 * 处理折扣申请
	 * @param discount  折扣数量
	 */
	public abstract void processDiscount(float discount);
	

}
