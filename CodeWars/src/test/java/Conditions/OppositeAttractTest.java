package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class OppositeAttractTest {
    @Test
    public void test(){
        Assert.assertTrue(OppositeAttract.isLove(7,8));
        Assert.assertFalse(OppositeAttract.isLove(9,9));
        Assert.assertFalse(OppositeAttract.isLove(16,4));
    }
}
