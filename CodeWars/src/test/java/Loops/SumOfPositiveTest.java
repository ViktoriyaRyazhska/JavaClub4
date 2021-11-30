package Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SumOfPositiveTest {
    @Test
    public void test() {
        int[] arr = new int[]{1, -2, 3};
        assertEquals(4, SumOfPositive.sum(new int[]{1, -2, 3}));
        assertEquals(5, SumOfPositive.sum(new int[]{1, -7, 4}));
        assertEquals(3, SumOfPositive.sum(new int[]{0, -2, 3}));
    }
}