package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

import java.time.Clock;

public class BeginnerSeriesTest {
    @Test
    public void test(){
        Assert.assertEquals(1000, BeginnerSeries.Past(0,0,1));
        Assert.assertEquals(128000, BeginnerSeries.Past(0,2,8));
        Assert.assertEquals(28974000, BeginnerSeries.Past(8,2,54));
    }
}
