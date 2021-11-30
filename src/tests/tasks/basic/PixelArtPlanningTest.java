package tests.tasks.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.basic.PixelArtPlanning;

public class PixelArtPlanningTest {
    PixelArtPlanning pixelArtPlanning = new PixelArtPlanning();
    @Test
    void isDivisibleTest() {
        assertTrue(pixelArtPlanning.getIsDivisible(100, 10), "wallLength == 100, pixelSize == 10");
        assertFalse(pixelArtPlanning.getIsDivisible(101, 10), "wallLength == 101, pixelSize == 10");
        assertFalse(pixelArtPlanning.getIsDivisible(0, 10), "wallLength == 0, pixelSize == 10");
    }
}
