import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
public class Problem10Test {
    private Problem10 problem10;

    @Before
    public void setUp(){
       problem10 = new Problem10();
    }

    @Test
    public void shouldReturnTrueIfPrimeNumber(){
        assertTrue(problem10.isPrime(5));
    }

    @Test
    public void shouldReturnSumOfPrimeNumbersAsInteger(){
        assertEquals(17, problem10.sumOfPrimeNumbersBelow(10));
    }


    @Test
    public void shouldReturnSumOfPrimeNumbersAsString(){
        assertEquals("17", problem10.sumOfPrimeNumbersBelowSolution(10));
    }

}