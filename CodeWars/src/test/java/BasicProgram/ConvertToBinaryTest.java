package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class ConvertToBinaryTest {
    @Test
    public void test(){
        Assert.assertEquals(101,ConvertToBinary.toBinary(5));
        Assert.assertEquals(10110,ConvertToBinary.toBinary(22));
        Assert.assertEquals(11,ConvertToBinary.toBinary(3));
    }
}
