package JUnitTests.Basics;

import Tasks.Basics.ThinkfulNumber.ThinkfulNumberImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestThinkfulNumber {
    @Test
    public void testThinkfulNumber() {
        assertEquals(true, new ThinkfulNumberImpl(10, 5).isDivisible());
    }
}
