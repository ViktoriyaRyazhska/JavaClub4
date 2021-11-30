package JUnitTests.Basics.MutiplyTwoNumbers;

import Tasks.Basics.MultiplyTwoNumbers.MultiplyTwoNumbersImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTwoNumbersImplTest {

    @ParameterizedTest
    @DisplayName("Should check If method return correct product")
    @CsvSource({
            "-3,      4",
            "0,       1",
            "2,       5"
    })
    void Should_CheckProduct(final int a, final int b) {
        final MultiplyTwoNumbersImpl multiplyTwoNumbers = new MultiplyTwoNumbersImpl(a, b);
        assertEquals(a * b, multiplyTwoNumbers.product());
    }
}