import java.util.ArrayList;

public class Dice {

    ArrayList<Die> dice;

    public Dice(Integer number) {
        dice = new ArrayList<>();
        initializeDice(number);
    }

    private void initializeDice(Integer number) {
        for (int i = 0; i < number; i++) {
            Die die = new Die();
            dice.add(die);
        }
    }
    
    public Integer tossAndSum() {
        Integer sum = 0;
        for (Die die: dice) {
            sum += die.toss();
        }
        return sum;
    }
    
    public Integer howManyDice() {
        return dice.size();
    }
    
}
