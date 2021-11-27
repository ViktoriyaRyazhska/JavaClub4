package tests.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.basic.PixelArtPlanning;

import java.lang.reflect.Method;

public class PixelArtPlanningTest {
    PixelArtPlanning pixelArtPlanning = new PixelArtPlanning();
    @Test
    void isDivisibleTest() {
        try {
            Method method = PixelArtPlanning.class.getDeclaredMethod("isDivisible", int.class, int.class);
            assertTrue((boolean) method.invoke(pixelArtPlanning, 100, 10), "wallLength == 100, pixelSize == 10");
            assertFalse((boolean) method.invoke(pixelArtPlanning, 101, 10), "wallLength == 101, pixelSize == 10");
            assertFalse((boolean) method.invoke(pixelArtPlanning, 0, 10), "wallLength < pixelSize");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
