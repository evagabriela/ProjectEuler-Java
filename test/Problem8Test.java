import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Problem8Test {
    @Test
    public void shouldReturnLargestProductAsString(){
        Problem8 problem8 = new Problem8();

        assertEquals("2123366400", problem8.run());
    }

}