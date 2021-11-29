package test_loops;

import loops.Loops_Task_4;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;

public class Test_Loops_Task_4 {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, Loops_Task_4.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, Loops_Task_4.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, Loops_Task_4.map(new int[] {1, 1, 1, 1, 1, 1}));
    }

    // Unxpected Result
    @Test
    public void sampleTestsUnxpectedResult() {
        assertNotEquals(new int[] {6, 2, 6}, Loops_Task_4.map(new int[] {1, 2, 3}));
        assertNotEquals(new int[] {1, 7, 4, 7, 8}, Loops_Task_4.map(new int[] {4, 1, 1, 1, 4}));
        assertNotEquals(new int[] {8, 3, 8, 1,4, 8}, Loops_Task_4.map(new int[] {1, 1, 1, 1, 1, 1}));
    }

}
