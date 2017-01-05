package com.imooc.strategy;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("********** 测试鸭子程序 **********");
		
		Duck duck = null;
//		duck = new MallardDuck();
//		duck = new RedheadDuck();
//		duck = new RubberDuck();
//		duck = new BigYellow();
		duck = new SpaceDuck();
		
		duck.display();
		duck.quack();
		duck.fly();
		
		System.out.println("********** 测试鸭子完毕 **********");
	}

}
