package Loops;

import org.junit.Assert;
import org.junit.Test;

public class GetTheMeanOfAnArrayTest {
    int[] arr = {2, 3, 5, 1, 4,
            0, 3, 4, 5, 5};

    @Test
    public void testB() {
        Assert.assertEquals(3, GetTheMeanOfAnArray.getAverage(arr));
    }

    int[] arr1 = {2, 4, 7};

    @Test
    public void testA() {
        Assert.assertEquals(4, GetTheMeanOfAnArray.getAverage(arr1));
    }
}