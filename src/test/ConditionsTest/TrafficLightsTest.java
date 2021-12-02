package test.ConditionsTest;

import Conditions.TrafficLights;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightsTest {

    @Test
    public void lightGreen() {
            assertEquals("Наступний колір буде: green", TrafficLights.updateLight("red"));
    }

    @Test
    public void lightYellow() {
        assertEquals("Наступний колір буде: yellow", TrafficLights.updateLight("green"));
    }

    @Test
    public void lightRed() {
        assertEquals("Наступний колір буде: red", TrafficLights.updateLight("yellow"));
    }

    @Test
    public void notALight() {
        assertEquals("Ви ввели неправильне значення", TrafficLights.updateLight("fbdf"));
    }
}