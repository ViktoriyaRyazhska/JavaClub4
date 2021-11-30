package test.ConditionsTest;

import Conditions.DoIGetBonus;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoIGetABonusTest {

    @Test
    public void GetBonusFirst() {
        String expected = "£1100";
        String result = DoIGetBonus.bonusTime(110,true);
        assertEquals(expected,result);
    }

    @Test
    public void GetBonusSecond() {
        String expected = "£110";
        String result = DoIGetBonus.bonusTime(110,false);
        assertEquals(expected,result);
    }

    @Test
    public void GetBonusThird() {
        String expected = "£5600";
        String result = DoIGetBonus.bonusTime(560,true);
        assertEquals(expected,result);
    }
}