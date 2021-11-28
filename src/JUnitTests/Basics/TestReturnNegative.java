package JUnitTests.Basics;

import Tasks.Basics.ReturnNegative.ReturnNegativeImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestReturnNegative {
    @Test
    public void testReturnNegative() {
        assertEquals(-3, new ReturnNegativeImpl(3).toNegative());
    }
}
