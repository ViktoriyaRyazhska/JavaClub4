package test.ConditionsTest;

import Conditions.SwitchItUp;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchItUpTest {

    @Test
    public void switchItUpFive() {
        String expected = "Five";
        String result = SwitchItUp.switchItUp(5);
        assertEquals(expected,result);
    }

    @Test
    public void switchItUpSeven() {
        String expected = "Seven";
        String result = SwitchItUp.switchItUp(7);
        assertEquals(expected,result);
    }

    @Test
    public void switchItUpZero() {
        String expected = "Zero";
        String result = SwitchItUp.switchItUp(0);
        assertEquals(expected,result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void switchItUpIncorrect() {
        SwitchItUp.switchItUp(22);
    }
}