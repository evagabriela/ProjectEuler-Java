import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Problem5Test {
    @Test
    public void shouldReturnSolutionAsAString(){
        Problem5 problem5 = new Problem5();

        assertEquals("232792560", problem5.run());
    }

    @Test
    public void shouldReturnSmallestPositiveNumberEvenlyDivisibleByAllNumbersFrom1to20AsInteger(){
        Problem5 problem5 = new Problem5();

        assertEquals(232792560, problem5.smallestPositiveNumberEvenlyDivisibleByAllNumbersFrom1to20());
    }
}