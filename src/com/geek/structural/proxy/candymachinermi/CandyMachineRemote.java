package com.geek.structural.proxy.candymachinermi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.geek.structural.proxy.candymachine.State;

public interface CandyMachineRemote extends Remote{
	public String  getLocation() throws RemoteException;
	public int getCount() throws RemoteException;
	public State getstate() throws RemoteException;
}
