package Proxy.server;

public class SoldState implements State {
    transient GumballMachine machine;
    public SoldState(GumballMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("aguarde a goma sair antes de inserir outra moeda...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("você já girou a alavanca");
    }

    @Override
    public void turnCrank() {
        System.out.println("você não pode girar a alavanca de novo");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.getCount() > 0){
            machine.setState(machine.getNoQuarter());
        }else{
            System.out.println("acabaram as gomas");
            machine.setState(machine.getSoldOut());
        }
    }
}
