import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine
        extends UnicastRemoteObject implements GumballMachineRemote {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State state;
    private int count;
    private String location;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        
        count = numberGumballs;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }

        this.location = location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nMighty Gumball, Inc.");
        sb.append("\nInventory: " + getCount() + " gumballs");
        if (state instanceof NoQuarterState) {
            sb.append("\nMachine is waiting for quarter");
        } else if (state instanceof SoldOutState) {
            sb.append("\nMachine is sold out");
        }
        sb.append("\n");

        return sb.toString();
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public State getCurrentState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count = count - 1;
        }
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getWinnerState() {
        return winnerState;
    }
}