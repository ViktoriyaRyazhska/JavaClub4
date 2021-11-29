package test_string;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import string.String_Task_12;

public class Test_String_Task_12 {


    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", String_Task_12.weatherInfo(50));
    }

    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", String_Task_12.weatherInfo(23));
    }


    // Unxpected Result
    @Test
    public void testAUnxpectedResult() {
        assertNotEquals("10.0 is freezing temperature", String_Task_12.weatherInfo(50));
    }

    @Test
    public void testBUnxpectedResult() {
        assertNotEquals("-5.0 is above freezing temperature", String_Task_12.weatherInfo(23));
    }
}
