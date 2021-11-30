package tests.tasks.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.basic.GrassHopper;

public class GrassHopperTest {
    GrassHopper grassHopper = new GrassHopper();
    @Test
    void convertToCelsiusTest() {
        assertEquals(-6.666666666666667, grassHopper.getConvertToCelsius(20), "temperature == 20" );
        assertEquals(5.0, grassHopper.getConvertToCelsius(41), "temperature == 41" );
        assertEquals(-20.0, grassHopper.getConvertToCelsius(-4), "temperature == -4" );
    }

    @Test
    void weatherInfoTest() {
        assertEquals("5.0 is above freezing temperature", grassHopper.getWeatherInfo(41), "temperature == 41");
        assertEquals("-20.0 is freezing temperature", grassHopper.getWeatherInfo(-4), "temperature == -4");
        assertEquals("0.0 is freezing temperature", grassHopper.getWeatherInfo(32), "temperature == 32");
    }
}
