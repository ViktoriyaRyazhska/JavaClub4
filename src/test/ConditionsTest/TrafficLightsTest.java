package test.ConditionsTest;

import Conditions.TrafficLights;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightsTest {

    @Test
    public void lightGreen() {
            assertEquals("green", TrafficLights.updateLight("red"));
    }

    @Test
    public void lightYellow() {
        assertEquals("yellow", TrafficLights.updateLight("green"));
    }

    @Test
    public void lightRed() {
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }

    @Test
    public void notALight() {
        assertEquals("Ви ввели неправильне значення", TrafficLights.updateLight("fbdf"));
    }
}