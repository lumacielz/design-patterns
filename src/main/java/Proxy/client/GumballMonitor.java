package Proxy.client;

import Proxy.server.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote machine;
    
    public GumballMonitor(GumballMachineRemote machine){
        this.machine = machine;
    }
    
    public void report() {
        try{
            System.out.println("Machine: " + machine.getLocation());
            System.out.println("Available Gumballs:"+ machine.getCount());
            System.out.println("Current State: " + machine.getState());
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
