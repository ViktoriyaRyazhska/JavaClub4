package JUnitTests.Conditions.OppositeNumber;

import Tasks.Conditions.OppositeNumber.OppositeNumberImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumberImplTest {

    @ParameterizedTest
    @DisplayName("Should check if method return correct number(if clause)")
    @ValueSource(ints = {-3})
    void Should_CheckOppositeNumber_If(final int number){
        final OppositeNumberImpl oppositeNumber = new OppositeNumberImpl(number);
        assertEquals(-3, oppositeNumber.oppositeNumber());
    }

    @ParameterizedTest
    @DisplayName("Should check if method return correct number(else clause)")
    @ValueSource(ints = {6})
    void Should_CheckToOppositeNumber_Else(final int number){
        final OppositeNumberImpl oppositeNumber = new OppositeNumberImpl(number);
        assertEquals(-6, oppositeNumber.oppositeNumber());
    }
}