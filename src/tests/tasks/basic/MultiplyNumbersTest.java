package tests.tasks.basic;

import application.tasks.basic.MultiplyNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyNumbersTest {
    MultiplyNumbers multiplyNumbers = new MultiplyNumbers();

    @Test
    void multiplyNumbersTest() {
        assertEquals(4,multiplyNumbers.getMultiplied(2,2));
        assertEquals(0,multiplyNumbers.getMultiplied(0,1000));
        assertEquals(100,multiplyNumbers.getMultiplied(100,1));
    }
}