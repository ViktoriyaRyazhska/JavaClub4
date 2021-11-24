package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class ThinkfulTest {
    @Test
    public void isDivisible(){
        Assert.assertFalse(Thinkful.isDivisible(1257,13));
        Assert.assertTrue(Thinkful.isDivisible(1800,10));
        Assert.assertTrue(Thinkful.isDivisible(11234,1));
    }
}
