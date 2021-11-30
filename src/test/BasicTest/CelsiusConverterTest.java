package test.BasicTest;

import Basic.CelsiusConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelsiusConverterTest {

    @Test
    void convertToCelsius() {
        assertEquals("10.0 is above freezing temperature", CelsiusConverter.weatherInfo(50));
        assertEquals("-5.0 is freezing temperature", CelsiusConverter.weatherInfo(23));
    }
}