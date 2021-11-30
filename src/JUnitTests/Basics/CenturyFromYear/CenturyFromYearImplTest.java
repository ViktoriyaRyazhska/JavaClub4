package JUnitTests.Basics.CenturyFromYear;

import Tasks.Basics.CenturyFromYear.CenturyFromYearImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CenturyFromYearImplTest {

    @ParameterizedTest
    @DisplayName("Should check If year = input year")
    @ValueSource(ints = {2021, 988, 1556, 74})
    void Should_CheckSetter_If(final int expectedNumbers){
        final CenturyFromYearImpl centuryFromYear = new CenturyFromYearImpl(expectedNumbers);
        assertEquals(expectedNumbers, centuryFromYear.getYear());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(input year, 1) = 1")
    @ValueSource(ints = {-917})
    void shouldCheckSetterElse(final int expectedNumbers){
        final CenturyFromYearImpl centuryFromYear = new CenturyFromYearImpl(expectedNumbers);
        assertEquals(Math.max(expectedNumbers, 1), centuryFromYear.getYear());
    }

    @ParameterizedTest
    @DisplayName("Should check If getCentury method return correct century(if clause)")
    @ValueSource(ints = {300})
    void Should_CheckGetCentury_If(final int expectedNumbers){
        final CenturyFromYearImpl centuryFromYear = new CenturyFromYearImpl(expectedNumbers);
        assertEquals(3, centuryFromYear.getCentury());
    }

    @ParameterizedTest
    @DisplayName("Should check If getCentury method return correct century(else clause)")
    @ValueSource(ints = {2021})
    void Should_CheckGetCentury_Else(final int expectedNumbers){
        final CenturyFromYearImpl centuryFromYear = new CenturyFromYearImpl(expectedNumbers);
        assertEquals(21, centuryFromYear.getCentury());
    }
}