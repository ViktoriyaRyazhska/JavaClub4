package JUnitTests.Conditions.BooleanToString;

import Tasks.Conditions.BooleanToString.BooleanToStringImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BooleanToStringImplTest {

    @ParameterizedTest
    @DisplayName("Should check If method return true(if clause)")
    @ValueSource(booleans = (true))
    void Should_CheckConvertToString_If(final boolean bool){
        final BooleanToStringImpl booleanToString = new BooleanToStringImpl(bool);
        assertEquals("true", booleanToString.convertToString());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return true(else clause)")
    @ValueSource(booleans = (false))
    void Should_CheckConvertToString_Else(final boolean bool){
        final BooleanToStringImpl booleanToString = new BooleanToStringImpl(bool);
        assertEquals("false", booleanToString.convertToString());
    }
}