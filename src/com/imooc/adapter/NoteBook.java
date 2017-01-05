package com.imooc.adapter;

public class NoteBook {

	private ThreePlugIf plug;
	
	public NoteBook(ThreePlugIf plug) {
		this.plug = plug;
	}
	
	// 使用插座充电
	public void charge() {
		plug.powerWhitThree();
	}
	
	public static void main(String[] args) {
		
		GBTwoPlug two = new GBTwoPlug();
		
		// 组合方式
		ThreePlugIf three = new TwoPlugAdapter(two);
		NoteBook nb = new NoteBook(three);
		nb.charge();
		
		// 继承方式
		three = new TwoPlugAdapterExtends();
		nb = new NoteBook(three);
		nb.charge();
		
	}

}
