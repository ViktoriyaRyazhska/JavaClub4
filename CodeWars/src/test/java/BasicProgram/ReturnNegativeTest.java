package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class ReturnNegativeTest {
    @Test
    public void test(){
        Assert.assertEquals(-5,ReturnNegative.makeNegative(5));
        Assert.assertEquals(5,ReturnNegative.makeNegative(-5));
    }
}
