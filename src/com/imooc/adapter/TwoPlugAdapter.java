package com.imooc.adapter;

/**
 * 二相转三相的插座适配器
 * 
 * 采用组合方式的适配器成为对象适配器
 */
public class TwoPlugAdapter implements ThreePlugIf {

	private GBTwoPlug plug;
	
	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug;
	}
	
	@Override
	public void powerWhitThree() {
		System.out.println("通过转化");
		plug.powerWithTwo();
	}

}
