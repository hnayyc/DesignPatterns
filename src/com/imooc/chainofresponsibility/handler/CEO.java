package com.imooc.chainofresponsibility.handler;

/**
 * 销售，可以批准5%以内的折扣
 * @author YangCheng
 *
 */
public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.55) {
			System.out.format("%s批准了折扣：%.4f%n", this.getClass().getName(), discount);
		}
		else {
			System.out.format("%s拒绝了折扣：%.4f%n", this.getClass().getName(), discount);
		}
	}

}
