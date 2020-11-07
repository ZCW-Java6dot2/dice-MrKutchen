import java.util.HashMap;

public class Bins {
    HashMap<Integer, Integer> bins;

    public Bins(Integer min, Integer max) {
        bins = new HashMap<Integer, Integer>();
        initializeBins(min, max);
    }

    private void initializeBins(Integer min, Integer max) {
        for (int i = min; i <= max; i++) {
            bins.put(i, 0);
        }
    }

    public void trackToss(int tossSum) {
        bins.put(tossSum, bins.get(tossSum) +1);
    }
}
