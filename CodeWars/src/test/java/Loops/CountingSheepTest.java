package Loops;

import org.junit.Assert;
import org.junit.Test;

public class CountingSheepTest {
    Boolean[] array = {true, false, false, true,
            true, false, false, true,
            true, false, false, true,
            true, false, false, true,
            true, false, false, true,
            true, false, false, true,};

    @Test
    public void testA() {
        Assert.assertEquals(12, new CountingSheep().countSheeps(array));
    }

    Boolean[] array2 = {true, false, false, true,
            true, false, true, true,
            true, false, false, true,
            true, false, false, true,
            true, true, false, true,
            true, false, true, true,};

    @Test
    public void testB() {
        Assert.assertEquals(15, new CountingSheep().countSheeps(array2));
    }
}
