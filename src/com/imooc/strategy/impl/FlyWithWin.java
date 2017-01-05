package com.imooc.strategy.impl;

import com.imooc.strategy.FlyingStragety;

public class FlyWithWin implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("振翅高飞");
	}

}
