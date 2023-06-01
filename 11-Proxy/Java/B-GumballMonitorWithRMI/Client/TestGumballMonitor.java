import java.rmi.*;

public class TestGumballMonitor {
    
    public static void main(String[] args) {
        String[] location = {"rmi://127.0.0.1/t1/gumballmachine",
                             "rmi://127.0.0.1/t2/gumballmachine"};

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; ++i) {
            try {
                GumballMachineRemote machine = 
                    (GumballMachineRemote)Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; ++i) {
            monitor[i].report();
        }
    }
}