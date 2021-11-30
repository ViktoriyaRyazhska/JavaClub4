package loops;

import org.junit.Test;
import tasks.loops.GrassHopperSum;

import static org.junit.Assert.assertEquals;

public class GrassHopperSumTest {

    @Test
    public void grassHopperSumTest() {
        assertEquals(1, GrassHopperSum.summation(1));
        assertEquals(36, GrassHopperSum.summation(8));
    }
}
