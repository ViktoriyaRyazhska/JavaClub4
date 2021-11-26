package test_loops;
import loops.Loops_Task_6;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Test_Loops_Task_6 {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Loops_Task_6.reverse(5));
    }
}
