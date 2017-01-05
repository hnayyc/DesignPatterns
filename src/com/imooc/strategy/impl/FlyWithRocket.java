package com.imooc.strategy.impl;

import com.imooc.strategy.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("用火箭在太空遨游");
	}

}
