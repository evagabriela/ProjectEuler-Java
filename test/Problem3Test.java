import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Problem3Test {
    @Test
    public void shouldReturnLargestPrimeFactorWhenRun(){
        Problem3 solution = new Problem3();
        assertEquals("6857", solution.run());
    }

}