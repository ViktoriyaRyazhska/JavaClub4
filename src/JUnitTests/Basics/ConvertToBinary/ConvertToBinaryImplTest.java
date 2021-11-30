package JUnitTests.Basics.ConvertToBinary;

import Tasks.Basics.ConvertToBinary.ConvertToBinaryImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToBinaryImplTest {

    @ParameterizedTest
    @DisplayName("Should check If number = input number")
    @ValueSource(ints = {15, 189, 1643})
    void Should_CheckSetter_If(final int expectedNumbers){
       final ConvertToBinaryImpl convertToBinary = new ConvertToBinaryImpl(expectedNumbers);
        assertEquals(expectedNumbers, convertToBinary.getN());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(number, 1) = 1")
    @ValueSource(ints = {-57})
    void Should_CheckSetter_Else(final int expectedNumbers){
        final ConvertToBinaryImpl convertToBinary = new ConvertToBinaryImpl(expectedNumbers);
        assertEquals(Math.max(expectedNumbers, 1), convertToBinary.getN());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct binary format")
    @ValueSource(ints = {120})
    void Should_CheckGetCentury(final int expectedNumbers){
        final ConvertToBinaryImpl convertToBinary = new ConvertToBinaryImpl(expectedNumbers);
        assertEquals("1111000", convertToBinary.toBinary());
    }
}