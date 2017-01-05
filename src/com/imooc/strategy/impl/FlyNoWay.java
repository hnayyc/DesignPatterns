package com.imooc.strategy.impl;

import com.imooc.strategy.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

	public FlyNoWay() {
		
	}
	
	@Override
	public void performFly() {
		System.out.println("我不会飞行！");
	}
}
