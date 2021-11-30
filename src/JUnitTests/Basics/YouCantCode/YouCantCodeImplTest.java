package JUnitTests.Basics.YouCantCode;

import Tasks.Basics.YouCantCode.YouCantCodeImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class YouCantCodeImplTest {

    @ParameterizedTest
    @DisplayName("Should check If method return correct doubled int")
    @ValueSource(ints = {-3, 1, 0, 4})
    void Should_CheckDoubleInteger(final int number){
        final YouCantCodeImpl youCantCode = new YouCantCodeImpl(number);
        assertEquals(number * 2, youCantCode.doubleInteger());
    }
}