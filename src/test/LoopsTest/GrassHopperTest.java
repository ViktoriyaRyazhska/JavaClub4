package test.LoopsTest;

import Loops.GrassHopper;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopperTest {

    @Test
    public void summationOf1() {
        assertEquals(1, GrassHopper.summation(1));
    }

    @Test
    public void summationOf8() {
        assertEquals(36, GrassHopper.summation(8));
    }

    @Test
    public void summationOfLong36() {
        assertEquals(666, GrassHopper.summation(36));
    }

    @Test
    public void summationOf100() {
        assertEquals(5050, GrassHopper.summation(100));
    }
}