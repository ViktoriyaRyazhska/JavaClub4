package tests.basic;

import org.junit.Test;
import tasks.basic.CenturyFromYear;
import tasks.basic.IntegerToBinary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CenturyFromYearTest {
    @Test(expected = Exception.class)
    public void FixedTests() {
        Object object = null;
        assertEquals(18, CenturyFromYear.centuryFromYear(1705));
        assertEquals(19, CenturyFromYear.centuryFromYear(1900));
        assertEquals(17, CenturyFromYear.centuryFromYear(1601));
        assertEquals(20, CenturyFromYear.centuryFromYear(2000));
        assertEquals(1,  CenturyFromYear.centuryFromYear(89));
        assertNull( CenturyFromYear.centuryFromYear((int)object));
        assertEquals(Exception.class,  CenturyFromYear.centuryFromYear(0));

    }
}
