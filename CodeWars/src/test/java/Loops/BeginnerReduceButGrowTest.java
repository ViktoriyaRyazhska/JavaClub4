package Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class BeginnerReduceButGrowTest {
    @Test
    public void test() {
        assertEquals(12, ReduceButGrow.grow(new int[]{1, 3, 4}));
        assertEquals(0, ReduceButGrow.grow(new int[]{0, 2, 4}));
    }
}