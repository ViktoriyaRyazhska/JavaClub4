package JUnitTests.Basics;

import Tasks.Basics.YouCantCode.YouCantCodeImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestYouCantCode {
    @Test
    public void testYouCantCode() {
        assertEquals(4, new YouCantCodeImpl(2).doubleInteger());
    }
}
