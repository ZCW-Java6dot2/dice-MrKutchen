public class Simulation {

    int numberOfDies;
    int numberOfTosses;
    Dice dice;
    public Bins bin;

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDies);
        this.bin = new Bins(numberOfDies, numberOfDies * 6);
    }

    public void runSimulation() {
        for (int i = 1; i < numberOfTosses; i++) {
            bin.trackToss(dice.tossAndSum());
        }
    }

    public String countDots(double percentage) {
        StringBuilder result = new StringBuilder();
        int p = (int)(percentage * 100);
        for (int i = 0; i < p; i++) {
            result.append("*");
        }
        return result.toString();
    }

    public void returnResults() {
        int p;
        double numberOfTimesPercentage;
        for (int i = 2; i < 13; i++) {
            p = bin.bins.get(i);

            numberOfTimesPercentage = ((double)p/numberOfTosses);

            String str=String.format("%3d : %8d: %-2.2f %-5s", i, p, numberOfTimesPercentage, countDots(numberOfTimesPercentage));
            System.out.println(str);
        }
    }
}
