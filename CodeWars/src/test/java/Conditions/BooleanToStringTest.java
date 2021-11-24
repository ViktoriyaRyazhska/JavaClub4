package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class BooleanToStringTest {
    @Test
    public void test(){
        Assert.assertEquals(BooleanToString.convert(true),"true");
        Assert.assertEquals(BooleanToString.convert(false),"false");
    }
}
