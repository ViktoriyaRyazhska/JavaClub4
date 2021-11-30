package JUnitTests.Basics.ReturnNegative;

import Tasks.Basics.ReturnNegative.ReturnNegativeImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ReturnNegativeImplTest {

    @ParameterizedTest
    @DisplayName("Should check if method return correct number(if clause)")
    @ValueSource(ints = {3})
    void Should_CheckToNegative_If(final int number){
        final ReturnNegativeImpl returnNegative = new ReturnNegativeImpl(number);
        assertEquals(-3, returnNegative.toNegative());
    }

    @ParameterizedTest
    @DisplayName("Should check if method return correct number(else clause)")
    @ValueSource(ints = {-6})
    void Should_CheckToNegative_Else(final int number){
        final ReturnNegativeImpl returnNegative = new ReturnNegativeImpl(number);
        assertEquals(-6, returnNegative.toNegative());
    }
}