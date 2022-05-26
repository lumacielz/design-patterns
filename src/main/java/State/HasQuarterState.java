package State;

public class HasQuarterState implements State{
    GumballMachine machine;
    public HasQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("você já inseriu uma moeda");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("devolvendo moeda...");
        machine.setState(machine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("você girou a alavanca...");
        machine.setState(machine.getSold());
    }

    @Override
    public void dispense() {
        System.out.println("operação inválida");
    }
}
