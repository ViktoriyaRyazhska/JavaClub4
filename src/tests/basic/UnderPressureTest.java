package tests.basic;

import application.tasks.basic.UnderPressure;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnderPressureTest {
    UnderPressure doubleInteger = new UnderPressure();
    @Test
    void doubleIntegerTest() {
    assertEquals(4,doubleInteger.getDoubleInteger(2),"");
    }
}