package JUnitTests.Basics;

import Tasks.Basics.CenturyFromYear.CenturyFromYearImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestCenturyFromYear {
    @Test
    public void testCenturyFromYear() {
        assertEquals(20, new CenturyFromYearImpl(2000).century());
    }
}
