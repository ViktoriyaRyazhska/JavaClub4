package test_loops;
import loops.Loops_Task_12;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class Test_Loops_Task_12 {
    @Test
    public void basicTests() {
        assertEquals(1, Loops_Task_12.nearestSq(1));
        assertEquals(1, Loops_Task_12.nearestSq(2));
        assertEquals(9, Loops_Task_12.nearestSq(10));
        assertEquals(121, Loops_Task_12.nearestSq(111));
        assertEquals(10000, Loops_Task_12.nearestSq(9999));
    }
}
