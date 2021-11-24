package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class OppositeNumberTest {
    @Test
    public void test(){
        Assert.assertEquals(-1,OppositeNumber.opposite(1));
        Assert.assertEquals(25,OppositeNumber.opposite(-25));
    }
}
