package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class VolumeOfCuboidTest {
    private static final double delta = 0.0001;
    @Test
    public void examples(){
        Assert.assertEquals(8 ,VolumeOfCuboid.getVolume(2,2,2),delta);
        Assert.assertEquals(57.6 ,VolumeOfCuboid.getVolume(2.4,3.2,7.5),delta);
    }
}
