package com.geek.structural.facade;

import com.geek.structural.facade.hometheater.HomeTheaterFacade;

public class MainTest {
	public static void main(String[] args) {
		HomeTheaterFacade mHomeTheaterFacade=new HomeTheaterFacade();
		
		mHomeTheaterFacade.ready();
		mHomeTheaterFacade.play();
	}
}
