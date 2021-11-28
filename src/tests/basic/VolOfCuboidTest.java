package tests.basic;

import org.junit.Assert;
import org.junit.Test;
import tasks.basic.VolOfCuboid;

public class VolOfCuboidTest {

    private static final double delta = 0.0001;

    @Test
    public void volOfCuboidTest(){
        Assert.assertEquals(8, VolOfCuboid.getVolumeOfCuboid(2, 2, 2), delta);
        Assert.assertEquals(4, VolOfCuboid.getVolumeOfCuboid(1, 2, 2), delta);
        Assert.assertEquals(63, VolOfCuboid.getVolumeOfCuboid(6.3, 2, 5), delta);

        Assert.assertNotEquals(6, VolOfCuboid.getVolumeOfCuboid(2, 2, 2), delta);
        Assert.assertNotEquals(10, VolOfCuboid.getVolumeOfCuboid(1, 2, 2), delta);
        Assert.assertNotEquals(12, VolOfCuboid.getVolumeOfCuboid(4, 2, 3), delta);
    }
}
