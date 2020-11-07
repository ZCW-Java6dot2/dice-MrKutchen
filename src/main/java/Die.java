import java.util.Random;

public class Die {

    int sides;

    public Die(Integer sides) {
        this.sides = sides;
    }

    public Die() {
        this(6);
    }

    public Integer toss() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

