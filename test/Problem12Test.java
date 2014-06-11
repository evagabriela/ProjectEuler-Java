import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Problem12Test {
    private Problem12 problem12;
    @Before
    public void setUp(){
        problem12 = new Problem12();
    }

    @Test
    public void shouldReturnDivisorOfANumber(){
        assertEquals(8, problem12.numberOfDivisors(48));
    }

    @Test
    public void shouldReturnTheValueOfTheFirstTriangleNumberThatHasOver500Divisor(){
        assertEquals("76576500", problem12.run());
    }
}