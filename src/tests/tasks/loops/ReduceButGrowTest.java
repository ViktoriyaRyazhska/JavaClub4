package tests.tasks.loops;

import application.tasks.loops.ReduceButGrow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReduceButGrowTest {
    ReduceButGrow reduceButGrow = new ReduceButGrow();
    @Test
    void growTest() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array3 = {0, 1, 2};
        assertEquals(24, reduceButGrow.getGrow(array1));
        assertEquals(3628800, reduceButGrow.getGrow(array2));
        assertEquals(0, reduceButGrow.getGrow(array3));
    }
}