import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Problem9Test {

    private Problem9 problem9;

    @Before
    public void setUp(){
        problem9 = new Problem9();

    }

    @Test
    public void shouldReturnTrueIfNumbersArePythagoreanTriplet(){
        assertTrue(problem9.isPythagorean(3,4,5));
    }

    @Test
    public void shouldReturnProductIfSumOfPythagoreanNumbersAreEqualTo1000(){
        assertEquals(31875000, problem9.productOfPythagorean() );
    }

}