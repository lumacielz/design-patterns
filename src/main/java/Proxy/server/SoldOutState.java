package Proxy.server;

public class SoldOutState implements State {
    transient GumballMachine machine;
    public SoldOutState(GumballMachine machine){
        this.machine = machine;
    }    @Override
    public void insertQuarter() {
        System.out.println("você não pode inserir uma moeda agora porque não há gomas na máquina");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("você ainda não inseriu uma moeda");
    }

    @Override
    public void turnCrank() {
        System.out.println("você ainda não inseriu uma moeda");
    }

    @Override
    public void dispense() {
        System.out.println("operação inválida!");
    }
}
