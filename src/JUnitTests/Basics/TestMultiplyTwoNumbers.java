package JUnitTests.Basics;

import Tasks.Basics.MultiplyTwoNumbers.MultiplyTwoNumbersImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMultiplyTwoNumbers {
    @Test
    public void testMultiplyTwoNumbers() {
        assertEquals(10, new MultiplyTwoNumbersImpl(2,5).multiply());
    }
}
