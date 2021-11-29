package basic;

import org.junit.Assert;
import org.junit.Test;
import tasks.basic.DoubleInteger;

public class DoubleIntegerTest {

    @Test
    public void doubleIntegerTest(){
        Assert.assertEquals(4,DoubleInteger.doubleInteger(2));
        Assert.assertEquals(8, DoubleInteger.doubleInteger(4));
        Assert.assertEquals(16, DoubleInteger.doubleInteger(8));
        Assert.assertNotEquals(4, DoubleInteger.doubleInteger(1));
        Assert.assertNotEquals(8, DoubleInteger.doubleInteger(7));
        Assert.assertNotEquals(20, DoubleInteger.doubleInteger(9));
    }

}
