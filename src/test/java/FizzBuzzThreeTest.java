import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzThreeTest {

    @Test
    void testBuzzle() {

        FizzBuzzThree fizzBuzzThree = new FizzBuzzThree();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz\nFizz: 4\nBuzz: 3\nFizzbuzz: 1\nLucky: 2\nInteger: 10";

        Assertions.assertEquals(expected, fizzBuzzThree.fizzleBuzzle(numbers));
    }
}
