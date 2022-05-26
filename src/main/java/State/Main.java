package State;

public class Main {
    public static void main (String[] args){
        GumballMachine machine = new GumballMachine(3);
        System.out.println(machine.state);
        machine.insertQuarter();
        System.out.println(machine.state);
        machine.turnCrank();
        System.out.println(machine.state);
        machine.ejectQuarter();
        System.out.println(machine.state);
        machine.insertQuarter();
        System.out.println(machine.state);
        machine.turnCrank();
        System.out.println(machine.state);
        machine.insertQuarter();
        System.out.println(machine.state);
        machine.turnCrank();
        System.out.println(machine.state);
    }
}
