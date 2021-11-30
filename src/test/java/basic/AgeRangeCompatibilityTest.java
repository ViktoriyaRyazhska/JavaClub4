package basic;

import org.junit.Assert;
import org.junit.Test;
import tasks.basic.AgeRangeCompatibility;

public class AgeRangeCompatibilityTest {

    @Test
    public void datingRange(){
        AgeRangeCompatibility ageRangeCompatibility = new AgeRangeCompatibility();

        Assert.assertEquals("15-20", ageRangeCompatibility.datingRange(17));
        Assert.assertEquals("27-66", ageRangeCompatibility.datingRange(40));
        Assert.assertEquals("9-11", ageRangeCompatibility.datingRange(10));

        Assert.assertNotEquals("10-1", ageRangeCompatibility.datingRange(10));
        Assert.assertNotEquals("15-7", ageRangeCompatibility.datingRange(10));
        Assert.assertNotEquals("18-3", ageRangeCompatibility.datingRange(10));

    }
}
