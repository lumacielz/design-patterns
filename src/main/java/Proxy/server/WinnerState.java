package Proxy.server;

public class WinnerState implements State {
    transient GumballMachine machine;
    public WinnerState(GumballMachine machine){
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
        System.out.println("Você é um GANHADOR e ganha 2 gomas por uma moeda!!!!");
        machine.releaseBall();
        machine.releaseBall();
        if (machine.getCount() > 0){
            machine.setState(machine.getNoQuarter());
        }else{
            System.out.println("acabaram as gomas...");
            machine.setState(machine.getSoldOut());
        }
    }
}
