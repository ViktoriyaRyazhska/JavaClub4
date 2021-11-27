package tests.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.basic.ConvertToBinary;

import java.lang.reflect.Method;

public class ConvertToBinaryTest {
    ConvertToBinary convertToBinary = new ConvertToBinary();
    @Test
    void convertToBinaryTest() {
        try {
            Method method = ConvertToBinary.class.getDeclaredMethod("convertToBinary", int.class);
            assertEquals(0, method.invoke(convertToBinary, 0), "n == 0");
            assertEquals(1010, method.invoke(convertToBinary, 10), "n == 10");
            assertEquals(0001_0000, method.invoke(convertToBinary, 16), "n == 16");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
