import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gzamudio on 5/16/14.
 */
//Problem 1:
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//        Find the sum of all the multiples of 3 or 5 below 1000.

public class Problem1Test {
    @Test
    public void shouldRunReturnSumOfMultiplesOfThreeAndFive(){
        Problem1 sumMultiplesOfthreeAndFive = new Problem1();

        assertEquals("233168", sumMultiplesOfthreeAndFive.run());
    }
}
