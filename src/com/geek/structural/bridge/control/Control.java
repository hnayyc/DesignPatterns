package com.geek.structural.bridge.control;

public interface Control {
	
	public void On();
	public void Off();
	public void setChannel(int ch);
	public void setVolume(int vol);

}
