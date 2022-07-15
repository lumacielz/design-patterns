package Proxy.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main (String[] args){
        GumballMachineRemote gumballMachine = null;
        int count = 10;

        try{
            gumballMachine = new GumballMachine("mymachine", count);
            LocateRegistry.createRegistry(1099);
            Naming.rebind( "rmi:/mymachine" , gumballMachine);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
