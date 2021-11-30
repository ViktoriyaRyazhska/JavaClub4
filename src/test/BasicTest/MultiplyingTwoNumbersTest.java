package test.BasicTest;

import Basic.MultiplyingTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyingTwoNumbersTest {

    @Test
    void multiply() {
        assertEquals(4, MultiplyingTwoNumbers.multiply(2, 2));
        assertEquals(8, MultiplyingTwoNumbers.multiply(2, 4));
        assertEquals(0, MultiplyingTwoNumbers.multiply(100, 0));
    }
}