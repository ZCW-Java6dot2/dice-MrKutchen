import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DiceTest {

    @Test
    public void rollDiceTest() {
        Die die = new Die();
        Integer actual = die.toss();
        Assert.assertTrue(actual >= 1 && actual <= 666);
    }

    @Test
    public void getNumberOfDiceTest() {
        Dice dice = new Dice(2);
        Integer expected = 2;
        Integer actual = dice.howManyDice();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void tossAndSumTest() {
        Dice dice = new Dice(2);
        Integer actual = dice.tossAndSum();
        Assert.assertTrue(actual >= 2 && actual <= 12);
    }
}