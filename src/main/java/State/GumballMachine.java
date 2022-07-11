package State;

public class GumballMachine {
    State noQuarter;
    State hasQuarter;
    State sold;
    State soldOut;

    State winnerState;

    State state = noQuarter;
    int count = 0;
    public GumballMachine(int n){
        noQuarter = new NoQuarterState(this);
        hasQuarter = new HasQuarterState(this);
        sold = new SoldState(this);
        soldOut = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = n;
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
