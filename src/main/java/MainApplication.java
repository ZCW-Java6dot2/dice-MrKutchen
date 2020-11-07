import java.text.SimpleDateFormat;

public class MainApplication {

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);

        System.out.println("***\n" +
                "Simulation of " + simulation.numberOfDies + " dice tossed for " + simulation.numberOfTosses + " times.\n" +
                "***\n");

        simulation.runSimulation();
        simulation.returnResults();
    }
}
