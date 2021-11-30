package test.BasicTest;

import Basic.VolumeOfACuboid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeOfACuboidTest {

    @Test
    void getVolumeOfCuboid() {
        final double delta = 0.0001;

        assertEquals(4, VolumeOfACuboid.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, VolumeOfACuboid.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}