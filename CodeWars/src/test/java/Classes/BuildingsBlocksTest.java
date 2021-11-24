package Classes;

import org.junit.Assert;
import org.junit.Test;

public class BuildingsBlocksTest {
    @Test
    public void test(){
        BuildingBlocks b = new BuildingBlocks(new int[] {5,5,5});
        Assert.assertEquals(5,b.getHeight());
        Assert.assertEquals(5,b.getWidth());
        Assert.assertEquals(5,b.getLength());
        Assert.assertEquals(150,b.getSurfaceArea());
        Assert.assertEquals(125,b.getVolume());
    }
}
