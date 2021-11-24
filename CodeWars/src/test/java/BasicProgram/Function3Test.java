package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class Function3Test {
    @Test
    public final void testAll(){
        Assert.assertEquals( 30,Function3.multiply(5,6));
        Assert.assertEquals( 25,Function3.multiply(-5,-5));
        Assert.assertEquals( 0,Function3.multiply(0,-5));
    }
}
