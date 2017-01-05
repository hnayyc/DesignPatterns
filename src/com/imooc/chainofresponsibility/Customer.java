package com.imooc.chainofresponsibility;

import java.util.Random;

import com.imooc.chainofresponsibility.handler.PriceHandler;
import com.imooc.chainofresponsibility.handler.PriceHandlerFactory;

/**
 * 客户，请求折扣
 * 
 * 之所以把Customer类放到chainofresponsibility包中，是为了体现Customer类和handler包中的类解耦。
 * Customer只和PriceHandler接口以及PriceHandlerFactory工厂类有耦合。
 */
public class Customer {

	private PriceHandler priceHandler;
	
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount) {
		priceHandler.processDiscount(discount);
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
		
		Random rand = new Random();
		for(int i=1; i<=100; i++) {
			System.out.print(i + ":");
			customer.requestDiscount(rand.nextFloat());
		}
	}
}
