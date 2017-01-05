package com.imooc.strategy;

import com.imooc.strategy.impl.FlyWithWin;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("我的头是红色的");
	}

}
