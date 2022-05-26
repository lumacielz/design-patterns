package State;

public class GumballMachine {
    State noQuarter;
    State hasQuarter;
    State sold;
    State soldOut;

    State state = noQuarter;
    int count = 0;
    public GumballMachine(int n){
        noQuarter = new NoQuarterState(this);
        hasQuarter = new HasQuarterState(this);
        sold = new SoldState(this);
        soldOut = new SoldOutState(this);

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
        this.count -= 1;
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
}
