package loops;

import org.junit.Test;
import tasks.loops.NearestSquareNum;

import static org.junit.Assert.assertEquals;

public class NearestSquareNumTest {

    @Test
    public void nearestSquareNumTest() {
        assertEquals(1, NearestSquareNum.nearestSq(1));
        assertEquals(1, NearestSquareNum.nearestSq(2));
        assertEquals(9, NearestSquareNum.nearestSq(10));
        assertEquals(121, NearestSquareNum.nearestSq(111));
        assertEquals(10000, NearestSquareNum.nearestSq(9999));
    }
}
