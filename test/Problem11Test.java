import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem11Test {
    @Test
    public void shouldReturnGreatestProduct(){
        Problem11 problem11 = new Problem11();
        assertEquals(70600674, problem11.greatestProduct());
    }
}