import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Problem6Test {
    @Test
    public void shouldReturnProblemResultAsAString(){
        Problem6 problem6 = new Problem6();
        assertEquals("25164150", problem6.run());
    }

}