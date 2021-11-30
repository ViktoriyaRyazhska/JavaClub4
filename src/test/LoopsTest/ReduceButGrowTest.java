package test.LoopsTest;

import Loops.ReduceButGrow;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReduceButGrowTest {

    @Test
    public void grow1to3() {
        assertEquals(6, ReduceButGrow.grow(new int[] {1,2,3}));
    }

    @Test
    public void growDifferent() {
        assertEquals(16, ReduceButGrow.grow(new int[] {4,1,1,1,4}));
    }

    @Test
    public void growSame() {
        assertEquals(64, ReduceButGrow.grow(new int[] {2,2,2,2,2,2}));
    }

    @Test
    public void growLong() {
        assertEquals(362880, ReduceButGrow.grow(new int[] {1,2,3,4,5,6,7,8,9}));
    }
}