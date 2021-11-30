package test.LoopsTest;

import Loops.MeanOfAnArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeanOfAnArrayTest {

    @Test
    public void getMeanOf4times2() {
        assertEquals(2, MeanOfAnArray.getAverage(new int[] {2,2,2,2}));
    }

    @Test
    public void getMeanOfDifferentValues() {
        assertEquals(3, MeanOfAnArray.getAverage(new int[] {1,2,3,4,5}));
    }

    @Test
    public void getMeanOfOfRoundedDown() {
        assertEquals(1, MeanOfAnArray.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

    @Test
    public void getMeanOfOfRoundedDownSecond() {
        assertEquals(2, MeanOfAnArray.getAverage(new int[] {3,1,5,1,4,3,1,2}));
    }
}