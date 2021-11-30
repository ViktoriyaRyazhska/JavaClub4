package test.StringTest;

import org.junit.jupiter.api.Test;
import String.AcceptsStringAndCountDoubles;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptsStringAndCountDoublesTest {
    @Test
    public void testSomething() {
        assertEquals(1, AcceptsStringAndCountDoubles.strCount("Hello", 'o'));
        assertEquals(2, AcceptsStringAndCountDoubles.strCount("Hello", 'l'));
        assertEquals(0, AcceptsStringAndCountDoubles.strCount("",'z'));
    }
}
