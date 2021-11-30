package JUnitTests.Conditions.YesOrNot;

import Tasks.Conditions.YesOrNot.YesOrNotImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class YesOrNotImplTest {

    @ParameterizedTest
    @DisplayName("Should check If method return true(if clause)")
    @ValueSource(booleans = (true))
    void Should_CheckBoolToWord_If(final boolean bool){
        final YesOrNotImpl yesOrNot = new YesOrNotImpl(bool);
        assertEquals("Yes", yesOrNot.boolToWord());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return true(else clause)")
    @ValueSource(booleans = (false))
    void Should_CheckBoolToWord_Else(final boolean bool){
        final YesOrNotImpl yesOrNot = new YesOrNotImpl(bool);
        assertEquals("No", yesOrNot.boolToWord());
    }
}