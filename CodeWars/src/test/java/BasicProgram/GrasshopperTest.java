package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class GrasshopperTest {
    @Test
    public void testTemp() {
        Assert.assertEquals("10.0 is above freezing temperature", Grasshopper.weatherInfo(50));
        Assert.assertEquals("-5.0 is freezing temperature", Grasshopper.weatherInfo(23));
    }
}
