package JUnitTests.Basics.VolumeOfACuboid;

import Tasks.Basics.VolumeOfACuboid.VolumeOfACuboidImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VolumeOfACuboidImplTest {

    @ParameterizedTest
    @DisplayName("Should check If length = input length")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckLengthSetter_If(final int length, final int width, final int height){
       final VolumeOfACuboidImpl volumeOfACuboid = new VolumeOfACuboidImpl(length, width, height);
        assertEquals(length, volumeOfACuboid.getLength());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(length, 1) = 1")
    @CsvSource({
            "-5,      3,      4"
    })
    void Should_CheckLengthSetter_Else(final int length, final int width, final int height){
        final VolumeOfACuboidImpl volumeOfACuboid = new VolumeOfACuboidImpl(length, width, height);
        assertEquals(Math.max(length, 1), volumeOfACuboid.getLength());
    }

    @ParameterizedTest
    @DisplayName("Should check If width = input width")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckWidthSetter_If(final int length, final int width, final int height){
        final VolumeOfACuboidImpl volumeOfACuboid = new VolumeOfACuboidImpl(length, width, height);
        assertEquals(width, volumeOfACuboid.getWidth());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(width, 1) = 1")
    @CsvSource({
            "5,      -3,      4"
    })
    void Should_CheckWidthSetter_Else(final int length, final int width, final int height){
        final VolumeOfACuboidImpl volumeOfACuboid = new VolumeOfACuboidImpl(length, width, height);
        assertEquals(Math.max(width, 1), volumeOfACuboid.getWidth());
    }

    @ParameterizedTest
    @DisplayName("Should check If height = input height")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckHeightSetter_If(final int length, final int width, final int height){
        final VolumeOfACuboidImpl volumeOfACuboid = new VolumeOfACuboidImpl(length, width, height);
        assertEquals(height, volumeOfACuboid.getHeight());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(height, 1) = 1")
    @CsvSource({
            "5,      3,      -4"
    })
    void Should_CheckHeightSetter_Else(final int length, final int width, final int height){
        final VolumeOfACuboidImpl volumeOfACuboid = new VolumeOfACuboidImpl(length, width, height);
        assertEquals(Math.max(height, 1), volumeOfACuboid.getHeight());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct volume")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckGetVolumeOfCuboid(final int length, final int width, final int height){
        final VolumeOfACuboidImpl volumeOfACuboid = new VolumeOfACuboidImpl(length, width, height);
        assertEquals(60, volumeOfACuboid.getVolumeOfCuboid());
    }
}