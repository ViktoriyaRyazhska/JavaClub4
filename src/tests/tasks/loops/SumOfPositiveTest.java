package tests.tasks.loops;

import application.tasks.loops.SumOfPositive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPositiveTest {
    SumOfPositive sumOfPositive = new SumOfPositive();
    @Test
    void sumTest() {
        int[] array1 = {0, 1, 1, -1};
        int[] array2 = {-10, -1, 0};
        int[] array3 = {-1, -1, -1};
        int[] array4 = {1, 2, 3, 4};

        assertEquals(2, sumOfPositive.getSum(array1), "{0, 1, 1, -1}");
        assertEquals(0, sumOfPositive.getSum(array2), "{-10, -1, 0}");
        assertEquals(0, sumOfPositive.getSum(array3), "{-1, -1, -1}");
        assertEquals(10, sumOfPositive.getSum(array4), "{1, 2, 3, 4}");
    }
}