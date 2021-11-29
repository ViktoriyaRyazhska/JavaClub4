package test_basic_program;

import basic_program.Basic_Program_Task_11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_Basic_Program_Task_11 {

    @Test
    public void weatherInfo() {
        assertEquals("10.0 is above freezing temperature", Basic_Program_Task_11.weatherInfo(50));
        assertNotEquals("15.0 is above freezing temperature", Basic_Program_Task_11.weatherInfo(51));
        assertNotEquals("-10.0 is above freezing temperature", Basic_Program_Task_11.weatherInfo(63));
    }

    @Test
    public void convertToCelsius() {
        assertEquals("-5.0 is freezing temperature", Basic_Program_Task_11.weatherInfo(23));
        assertNotEquals("-30.0 is freezing temperature", Basic_Program_Task_11.weatherInfo(0));
        assertNotEquals("-40.0 is freezing temperature", Basic_Program_Task_11.weatherInfo(10));
    }
}