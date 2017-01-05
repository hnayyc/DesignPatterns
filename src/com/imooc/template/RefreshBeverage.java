package com.imooc.template;

/**
 * 抽象基类，为所有子类提供一个算法框架
 * @author YangCheng
 * 
 * 提神饮料
 */
public abstract class RefreshBeverage {

	/**
	 * 使用final修饰模板方法，禁止子类对模板方法对父类方法的重写，禁止子类对算法框架做任何改变
	 * 
	 * 制备饮料的模板方法
	 * 封装了所有子类共同准寻的算法框架
	 */
	public final void prepareBeverageTemplate() {
		// 步骤1：将水煮沸
		boilWater();
		// 步骤2：泡制饮料
		brew();
		// 步骤3：将饮料倒入杯中
		pourInCup();
		
		if(isCustomerWantsCondiments()) {
			// 步骤4：加入调味料
			addCondiments();			
		}
	}

	/**
	 * Hook方法（钩子函数）提供一个默认或空的实现
	 * 具体的子类可以自行决定是否挂钩以及如何挂钩
	 * 询问用户是否加入调料
	 */
	protected boolean isCustomerWantsCondiments() {
		return true;
	}

	/**
	 * 基本方法：将水煮沸
	 */
	private void boilWater() {
		System.out.println("将水煮沸");
	}
	
	/**
	 * 基本方法：将饮料倒入杯中
	 */
	private void pourInCup() {
		System.out.println("将饮料倒入杯中");
	}
	
	/**
	 * 抽象的基本方法：泡制饮料
	 */
	protected abstract void brew();
	
	/**
	 * 抽象的基本方法：加入调味料
	 */
	protected abstract void addCondiments();
}
