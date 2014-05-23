import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Problem6Test {
    private Problem6 problem6;

    @Before
    public void setUp(){
        problem6 = new Problem6();

    }

    @Test
    public void shouldReturnProblemResultAsAString(){
        assertEquals("25164150", problem6.run());
    }

    @Test
    public void shouldReturnTheSquareOfTheSumOfTheFirstTenNaturalNumbers(){
        assertEquals(25502500, problem6.squareOfTheSumOfTheFirstTenNaturalNumbers());

    }

    @Test
    public void shouldReturnTheDifferenceBetweenTheSumOfTheSquareOfTheFirstTenNumbersAndTheSquareOfTheSumOfThem(){
        assertEquals(25164150, problem6.differenceBetweenBoth());
    }

    @Test
    public void shouldReturnTheSumOfTheSquaresOfTheFirstTenNumbers(){
        assertEquals(338350, problem6.sumOfTheSquaresOfFirstTenNaturalNumbers());
    }

    @Test
    public void shouldReturnTheSquareOfTheSumOfTheFirstTenNumbers(){
        assertEquals(25502500, problem6.squareOfTheSumOfTheFirstTenNaturalNumbers());
    }

}