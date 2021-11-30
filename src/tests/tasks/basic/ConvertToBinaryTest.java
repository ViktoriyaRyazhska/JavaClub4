package tests.tasks.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.basic.ConvertToBinary;

public class ConvertToBinaryTest {
    ConvertToBinary convertToBinary = new ConvertToBinary();
    @Test
    void convertToBinaryTest() {
        assertEquals(0, convertToBinary.getConvertToBinary(0), "n == 0");
        assertEquals(1010, convertToBinary.getConvertToBinary(10), "n == 10");
        assertEquals(10000, convertToBinary.getConvertToBinary(16), "n == 16");
    }
}
