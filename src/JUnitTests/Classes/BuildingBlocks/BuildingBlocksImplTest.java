package JUnitTests.Classes.BuildingBlocks;

import Tasks.Classes.BuildingBlocks.BuildingBlocksImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BuildingBlocksImplTest {

    @ParameterizedTest
    @DisplayName("Should check If width = input width")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckWidthSetter_If(final int width, final int length, final int height){
        final BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(width, length, height);
        assertEquals(length, buildingBlocks.getLength());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(width, 1) = 1")
    @CsvSource({
            "-5,      -3,      4"
    })
    void Should_CheckWidthSetter_Else(final int length, final int width, final int height){
        final BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(width, length, height);
        assertEquals(Math.max(width, 1), buildingBlocks.getWidth());
    }

    @ParameterizedTest
    @DisplayName("Should check If length = input length")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckLengthSetter_If(final int width, final int length, final int height){
       final BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(width, length, height);
       assertEquals(length, buildingBlocks.getLength());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(length, 2) = 2")
    @CsvSource({
            "5,      -3,      4"
    })
    void Should_CheckLengthSetter_Else(final int length, final int width, final int height){
        final BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(width, length, height);
        assertEquals(Math.max(length, 2), buildingBlocks.getLength());
    }

    @ParameterizedTest
    @DisplayName("Should check If height = input height")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckHeightSetter_If(final int width, final int length, final int height){
        final BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(width, length, height);
        assertEquals(height, buildingBlocks.getHeight());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(height, 1) = 1")
    @CsvSource({
            "5,      3,      -4"
    })
    void Should_CheckHeightSetter_Else(final int length, final int width, final int height){
        final BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(width, length, height);
        assertEquals(Math.max(height, 1), buildingBlocks.getHeight());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct volume")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckGetVolumeOfCuboid(final int length, final int width, final int height){
        final BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(width, length, height);
        assertEquals(60, buildingBlocks.getVolume());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct volume")
    @CsvSource({
            "5,      3,      4"
    })
    void Should_CheckGetSurfaceArea(final int length, final int width, final int height){
        final BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(width, length, height);
        assertEquals(94, buildingBlocks.getSurfaceArea());
    }
}