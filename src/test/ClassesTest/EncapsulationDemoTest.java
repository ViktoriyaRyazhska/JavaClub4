package test.ClassesTest;

import Classes.Block;
import Classes.EncapsulationDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncapsulationDemoTest {

    @Test
    public void testSample() {
        EncapsulationDemo ed = new EncapsulationDemo();
        int expected = 0;
        int result = ed.getNumber();
        assertEquals(expected, result);
    }

    @Test
    void setAndGetNumber() {
        EncapsulationDemo ed = new EncapsulationDemo();
        ed.setNumber(5);
        int expected = 5;
        int result = ed.getNumber();
        assertEquals(expected, result);
    }

    @Test
    void setAndGetStringValue() {
        EncapsulationDemo ed = new EncapsulationDemo();
        ed.setStringValue("hello");
        String expected = "hello";
        String result = ed.getStringValue();
        assertEquals(expected, result);
    }

    @Test
    void setAndGetAnObject() {
        EncapsulationDemo ed = new EncapsulationDemo();
        Object o = new Object();
        ed.setAnObject(o);
        Object expected = o;
        Object result = ed.getAnObject();
        assertEquals(expected, result);
    }
}