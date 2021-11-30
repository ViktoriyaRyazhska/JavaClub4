package tests.tasks.conditions;

import application.tasks.conditions.SwitchItUp;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class SwitchItUpTest {
    SwitchItUp switchItUp = new SwitchItUp();
    HashMap<Integer, String> result = new HashMap<>() {{
        put(0, "Zero");
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");
    }};
    @Test
    void mapTest() {
        assertEquals(result, switchItUp.getMap(), "map compare");
    }

    @Test
    void switchItUpTest() {
        assertEquals("Zero", switchItUp.getSwitchItUp(0, result), "0");
        assertEquals("One", switchItUp.getSwitchItUp(1, result), "1");
        assertEquals("Two", switchItUp.getSwitchItUp(2, result), "2");
        assertEquals("Three", switchItUp.getSwitchItUp(3, result), "3");
        assertEquals("Four", switchItUp.getSwitchItUp(4, result), "4");
        assertEquals("Five", switchItUp.getSwitchItUp(5, result), "5");
        assertEquals("Six", switchItUp.getSwitchItUp(6, result), "6");
        assertEquals("Seven", switchItUp.getSwitchItUp(7, result), "7");
        assertEquals("Eight", switchItUp.getSwitchItUp(8, result), "8");
        assertEquals("Nine", switchItUp.getSwitchItUp(9, result), "9");
        assertEquals("Ten", switchItUp.getSwitchItUp(10, result), "10");
    }
}