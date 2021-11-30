package test.StringTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import String.Kata;

public class KataTest{
    @Test
    public void sampleTests() {
        assertEquals("dlrow", Kata.solution("world"));
    }
}