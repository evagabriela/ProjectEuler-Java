import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Problem4Test {
    @Test
    public void shouldReturnAResultAStringAsWhenRun(){
        Problem4 solution = new Problem4();

        assertEquals("906609", solution.run());
    }

    @Test
    public void shouldReturnAllPalindromeNumbersFromTheProductOf3DigitNumbers(){
        Problem4 arraySolution = new Problem4();

        ArrayList<Integer> arrayExpected = arraySolution.palindromeNumber();

        assertTrue(arrayExpected.contains(906609));
    }

    @Test
    public void shouldReturnTrueIfNumberIsPalindrome(){
        Problem4 solution = new Problem4();

        assertTrue(solution.isPaling(906609));

    }

}