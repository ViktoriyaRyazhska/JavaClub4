package JUnitTests.Classes;

import Tasks.Classes.BuildingBlocks.BuildingBlocksImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBuildingBlocks {
    @Test
    public void testBuildingBlocks() {
        BuildingBlocksImpl buildingBlocks = new BuildingBlocksImpl(2, 3, 4);
        assertEquals(24, buildingBlocks.getVolume());
        assertEquals(52, buildingBlocks.getSurfaceArea());
    }
}
