package Proxy.client;

import Proxy.server.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) {
        String[] location = {"rmi:/riocomprido"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];
        for (int i=0; i < location.length; i++){
            try{
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        for (int i =0;i< monitor.length;i++){
            monitor[i].report();
        }
    }

}
