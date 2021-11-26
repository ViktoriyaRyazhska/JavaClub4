package Loops;

import org.junit.Assert;
import org.junit.Test;

public class CatYearsDogTest {
    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{2,24,24},CatYearsDog.humanYearsCatYearsDogYears(2));
        Assert.assertArrayEquals(new int[]{1,15,15},CatYearsDog.humanYearsCatYearsDogYears(1));
        Assert.assertArrayEquals(new int[]{15,76,89},CatYearsDog.humanYearsCatYearsDogYears(15));
    }
}
