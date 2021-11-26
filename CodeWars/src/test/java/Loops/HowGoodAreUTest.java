package Loops;

import org.junit.Assert;
import org.junit.Test;

public class HowGoodAreUTest {
    int[] classPoint = {2, 6, 8, 5, 1, 5, 6, 7, 12};
    int UrPoint = 10;

    @Test
    public void testA() {
        Assert.assertTrue("true", HowGoodAreU.betterThanAverage(classPoint, UrPoint));
    }

    int[] classPoint1 = {10, 10, 10, 12, 9, 8};
    int UrPoint1 = 5;

    @Test
    public void testB() {
        Assert.assertFalse("false", HowGoodAreU.betterThanAverage(classPoint1, UrPoint1));
    }
}
