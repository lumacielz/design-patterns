package Proxy.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    String location;
    State noQuarter;
    State hasQuarter;
    State sold;
    State soldOut;
    State winnerState;

    State state = noQuarter;
    int count = 0;
    public GumballMachine(String location, int n) throws RemoteException {
        noQuarter = new NoQuarterState(this);
        hasQuarter = new HasQuarterState(this);
        sold = new SoldState(this);
        soldOut = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = n;
        this.location = location;
        if (n == 0){
            this.state = soldOut;
        }else{
            this.state = noQuarter;
        }
    }

    public void setState(State newState){
        this.state = newState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public int getCount() {
        return count;
    }

    public String getLocation(){return location;}

    public State getState(){return state;}

    public void releaseBall(){
        System.out.println("goma saindo...");
        this.count -= 1;
    }

    public void fill(int n){
        this.count += n;
        this.state = noQuarter;
    }
    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getSold() {
        return sold;
    }

    public State getSoldOut() {
        return soldOut;
    }

    public State getWinner() {return winnerState;}
}
