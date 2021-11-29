package tests.ConditionsTest;

import Conditions.TrafficLights;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightsTest {

    @Test
    void updateLight() {
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));    }
}