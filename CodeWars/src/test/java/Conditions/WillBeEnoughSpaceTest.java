package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class WillBeEnoughSpaceTest {
    @Test
    public void test(){
        Assert.assertEquals(0,WillBeEnoughSpace.enough(50,25,25));
        Assert.assertEquals(25,WillBeEnoughSpace.enough(25,25,25));
        Assert.assertEquals(0,WillBeEnoughSpace.enough(35,5,7));
    }
}
