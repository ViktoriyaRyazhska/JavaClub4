package tests.tasks.loops;

import application.tasks.loops.GapInPrimes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GapInPrimesTest {
    GapInPrimes gapInPrimes = new GapInPrimes();

    List<Integer> list1 = Arrays.asList(101, 103);
    List<Integer> list2 = Arrays.asList(103, 107);
    List<Integer> list3 = Arrays.asList();
    List<Integer> list4 = Arrays.asList(359, 367);
    List<Integer> list5 = Arrays.asList(337, 347);

    @Test
    void gapInPrimesTest() {
        assertEquals(list1, gapInPrimes.getFindGap(2, 100, 110));
        assertEquals(list2,gapInPrimes.getFindGap(4, 100, 110));
        assertEquals(list3, gapInPrimes.getFindGap(6, 100, 110));
        assertEquals(list4, gapInPrimes.getFindGap(8, 300, 400));
        assertEquals(list5, gapInPrimes.getFindGap(10, 300, 400));
    }
}