package JUnitTests.Basics;

import Tasks.Basics.VolumeOfACuboid.VolumeOfACuboidImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestVolumeOfACuboid {
    @Test
    public void testVolumeOfACuboid() {
        assertEquals(48, new VolumeOfACuboidImpl(2, 4, 6).getVolumeOfCuboid());
    }
}
