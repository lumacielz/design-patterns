package State;

public class NoQuarterState implements State{
    GumballMachine machine;

    public NoQuarterState(GumballMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("você inseriu uma moeda");
        machine.setState(machine.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("não existe moedas a serem devolvidas...");
    }

    @Override
    public void turnCrank() {
        System.out.println("você precisa introduzir uma moeda antes...");
    }

    @Override
    public void dispense() {
        System.out.println("operação inválida!");
    }
}
