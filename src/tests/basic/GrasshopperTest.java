package tests.basic;

import org.junit.Assert;
import org.junit.Test;
import tasks.basic.Grasshopper;

public class GrasshopperTest {

    @Test
    public void grasshopperTest() {

        Assert.assertEquals("10.0 is above freezing temperature", Grasshopper.weatherInfo(50));
        Assert.assertEquals("5.0 is above freezing temperature", Grasshopper.weatherInfo(41));
        Assert.assertEquals("-5.0 is freezing temperature", Grasshopper.weatherInfo(23));
        Assert.assertEquals("-10.0 is freezing temperature", Grasshopper.weatherInfo(14));

        Assert.assertNotEquals("10.0 is above freezing temperature", Grasshopper.weatherInfo(101));
        Assert.assertNotEquals("20.0 is above freezing temperature", Grasshopper.weatherInfo(59));
        Assert.assertNotEquals("-14.0 is freezing temperature", Grasshopper.weatherInfo(21));
        Assert.assertNotEquals("-2.0 is freezing temperature", Grasshopper.weatherInfo(0));
    }
}
