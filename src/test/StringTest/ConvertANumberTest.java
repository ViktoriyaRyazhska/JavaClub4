package test.StringTest;

import String.IntToString;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertANumberTest {

    @Test
    public void ConvertANumberFirst() {
        String expected = "10";
        String result = IntToString.numberToString(10);
        assertEquals(expected,result);
    }

    @Test
    public void ConvertANumberSecond() {
        String expected = "152";
        String result = IntToString.numberToString(152);
        assertEquals(expected,result);
    }

    @Test
    public void ConvertANumberThird() {
        String expected = "13629";
        String result = IntToString.numberToString(13629);
        assertEquals(expected,result);
    }
}