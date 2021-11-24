package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class AgeRangeTest {
    @Test
    public void test(){
        Assert.assertEquals("21-42",AgeRange.datingRange(28));
        Assert.assertEquals("7-8",AgeRange.datingRange(8));
    }
}
