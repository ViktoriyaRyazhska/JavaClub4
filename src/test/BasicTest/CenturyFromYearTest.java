package test.BasicTest;

import Basic.CenturyFromYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenturyFromYearTest {

    @Test
    void century() {
        assertEquals(18, CenturyFromYear.Century(1705));
        assertEquals(19, CenturyFromYear.Century(1900));
        assertEquals(17, CenturyFromYear.Century(1601));
        assertEquals(20, CenturyFromYear.Century(2000));
        assertEquals(1, CenturyFromYear.Century(89));

    }
}