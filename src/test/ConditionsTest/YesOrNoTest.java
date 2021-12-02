package test.ConditionsTest;

import Conditions.boolToWord;
import org.junit.Test;

import static org.junit.Assert.*;

public class YesOrNoTest {

    @Test
    public void YesOrNoFirst() {
        String expected = "Yes";
        String result = boolToWord.convert(true);
        assertEquals(expected,result);
    }

    @Test
    public void YesOrNoSecond() {
        String expected = "Yes";
        String result = boolToWord.convert(true);
        assertEquals(expected,result);
    }

    @Test
    public void YesOrNoThird() {
        String expected = "No";
        String result = boolToWord.convert(false);
        assertEquals(expected,result);
    }
}