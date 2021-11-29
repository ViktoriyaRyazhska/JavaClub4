package test_oop;

import oop.OOP_Task_3;
import org.junit.Test;

import java.util.Base64;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class Test_OOP_Task_3 {

    @Test
    public void encode() {
        assertTrue("empty string", new OOP_Task_3().encode("").equals(""));
        assertTrue("abcdef string", new OOP_Task_3().encode("abcdef").equals("4bcd3f"));

    }
}