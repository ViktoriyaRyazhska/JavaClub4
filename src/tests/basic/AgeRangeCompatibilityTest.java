package tests.basic;

import org.junit.Assert;
import org.junit.Test;
import tasks.basic.AgeRangeCompatibility;

public class AgeRangeCompatibilityTest {

    @Test
    public void ageRangeCompatibilityTest(){

        Assert.assertEquals("15-20", AgeRangeCompatibility.datingRange(17));
        Assert.assertEquals("27-66", AgeRangeCompatibility.datingRange(40));
        Assert.assertEquals("9-11", AgeRangeCompatibility.datingRange(10));

        Assert.assertNotEquals("10-1", AgeRangeCompatibility.datingRange(10));
        Assert.assertNotEquals("15-7", AgeRangeCompatibility.datingRange(10));
        Assert.assertNotEquals("18-3", AgeRangeCompatibility.datingRange(10));

    }
}
