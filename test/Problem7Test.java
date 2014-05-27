import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class Problem7Test {

    private Problem7 problem7;

    @Before
    public void setUp(){
        problem7 = new Problem7();
    }

    @Test
    public void shouldReturnStringSolutionWhenRun(){
        assertEquals("104743",problem7.run());
    }

    @Test
    public void shouldReturnIntegerSolution(){
        assertEquals(104743, problem7.primeNumberOfPosition(10001));
    }

    @Test
    public void shouldReturnTrueWhenIsPrimeOfNumber5(){
        assertTrue(problem7.isPrime(5));
    }

    @Test
    public void shouldReturnFalseWhenIsPrimeOfNumber6(){
        assertFalse(problem7.isPrime(6));
    }

}