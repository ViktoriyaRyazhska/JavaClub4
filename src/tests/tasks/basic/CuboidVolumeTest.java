package tests.tasks.basic;

import application.tasks.basic.CuboidVolume;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidVolumeTest {
CuboidVolume cuboidVolume = new CuboidVolume();
    @Test
    void cuboidVolumeTest() {
        assertEquals(4,cuboidVolume.getVolume(1,2,2));
        assertEquals(63,cuboidVolume.getVolume(6.3,2,5));
    }
}