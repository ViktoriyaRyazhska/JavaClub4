package test_loops;
import loops.Loops_Task_8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;

public class Test_Loops_Task_8 {
    @Test
    public void testSomething() {
        assertEquals(6, Loops_Task_8.grow(new int[]{1,2,3}));
        assertEquals(16, Loops_Task_8.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, Loops_Task_8.grow(new int[]{2,2,2,2,2,2}));
    }
}
