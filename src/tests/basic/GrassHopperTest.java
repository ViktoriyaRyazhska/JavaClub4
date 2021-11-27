package tests.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.basic.GrassHopper;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class GrassHopperTest {
    GrassHopper grassHopper = new GrassHopper();
    @Test
    void convertToCelsiusTest() {
        try {
            Method method = GrassHopper.class.getDeclaredMethod("convertToCelsius", int.class);
            assertEquals(-6.666666666666667, method.invoke(grassHopper, 20), "temperature == 20" );
            assertEquals(5.0, method.invoke(grassHopper, 41), "temperature == 41" );
            assertEquals(-20.0, method.invoke(grassHopper, -4), "temperature == -4" );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void weatherInfoTest() {
        try {
            Method method = GrassHopper.class.getDeclaredMethod("weatherInfo", int.class);
            assertEquals("5.0 is above freezing temperature", method.invoke(grassHopper, 41), "temperature == 41");
            assertEquals("-20.0 is freezing temperature", method.invoke(grassHopper, -4), "temperature == -4");
            assertEquals("0.0 is freezing temperature", method.invoke(grassHopper, 32), "temperature == 32");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
