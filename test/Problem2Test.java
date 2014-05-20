import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Problem2Test {
    @Test
    public void shouldReturnSumOfFibonacciNumbersUnderFourMillionWhenRun(){
        Problem2 sumFibonacciNumbers = new Problem2();

        assertEquals("4613732", sumFibonacciNumbers.run());
    }

}