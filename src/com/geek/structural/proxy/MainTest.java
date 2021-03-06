package com.geek.structural.proxy;

import java.rmi.RemoteException;

import com.geek.structural.proxy.candymachine.CandyMachine;

public class MainTest {
	public static void main(String[] args) throws RemoteException {
		Monitor mMonitor=new Monitor();
		CandyMachine mCandyMachine = new CandyMachine("NY",6);
		mMonitor.addMachine(mCandyMachine);
		
		mCandyMachine = new CandyMachine("TK",4);
		mCandyMachine.insertCoin();
		mMonitor.addMachine(mCandyMachine);
		
		mCandyMachine = new CandyMachine("Bj",14);
		mCandyMachine.insertCoin();	
		mCandyMachine.turnCrank();
		mMonitor.addMachine(mCandyMachine);

		mMonitor.report();
	}
}
