import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Problem3Test {
    @Test
    public void shouldReturnStringTypeLargestPrimeFactorWhenRun(){
        Problem3 solution = new Problem3();
        assertEquals("6857", solution.run(600851475143L));
    }

    @Test
    public void shouldReturnLongTypeOutputForLargestPrimeFactor(){
        Problem3 solution = new Problem3();
        long number = 600851475143L;

        assertEquals(6857, solution.largestPrimeFactor(number));
    }
}