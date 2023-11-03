package fizz_buzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testGivenNumberOneReturnsString1() {
        FizzBuzz game = new FizzBuzz();
        Assert.assertEquals("1", game.forNumber(1));
    }

    @Test
    public void testGivenNumberNotDivisibleByThreeOrFiveReturnsNumberAsString() {
        FizzBuzz game = new FizzBuzz();
        Assert.assertEquals("7", game.forNumber(7));
        Assert.assertEquals("2", game.forNumber(2));
    }

    @Test
    public void testGivenNumberDivisibleByThreeReturnsFizz() {
        FizzBuzz game = new FizzBuzz();
        Assert.assertEquals("Fizz", game.forNumber(3));
        Assert.assertEquals("Fizz", game.forNumber(6));
    }

    @Test
    public void testGivenNumberDivisibleByFiveReturnsBuzz() {
        FizzBuzz game = new FizzBuzz();
        Assert.assertEquals("Buzz", game.forNumber(5));
        Assert.assertEquals("Buzz", game.forNumber(10));
    }

    @Test
    public void testGivenNumberDivisibleByFifteenReturnsFizzBuzz() {
        FizzBuzz game = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", game.forNumber(15));
        Assert.assertEquals("FizzBuzz", game.forNumber(30));
    }
}
