package test_loops;

import loops.Loops_Task_4;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class Test_Loops_Task_4 {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, Loops_Task_4.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, Loops_Task_4.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, Loops_Task_4.map(new int[] {1, 1, 1, 1, 1, 1}));
    }

}
