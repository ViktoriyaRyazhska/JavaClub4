package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class TrafficLightTest {
    @Test
    public void test(){
        Assert.assertEquals("yellow",TrafficLight.updateLight("green"));
        Assert.assertEquals("green",TrafficLight.updateLight("red"));
        Assert.assertEquals("red",TrafficLight.updateLight("yellow"));
    }
}
