import java.rmi.*;

public class TestGumballMachineRemote {
    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Gumball Machine <name> <inventory>");
            System.exit(1);
        }

        GumballMachineRemote gumballMachine = null;

        try {
            int count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("/" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}