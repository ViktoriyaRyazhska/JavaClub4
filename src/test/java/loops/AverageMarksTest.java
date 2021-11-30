package loops;

import org.junit.Test;
import tasks.loops.AverageMarks;

import static org.junit.Assert.assertEquals;

public class AverageMarksTest {

    @Test
    public void averageMarksTest() {
        assertEquals(2, AverageMarks.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,AverageMarks.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,AverageMarks.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}
