package test_basic_program;
import basic_program.Basic_Program_Task_6;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Basic_Program_Task_6 {
    @Test
    public void testToBinary() {
        assertEquals(1, Basic_Program_Task_6.toBinary(1));
        assertEquals(10, Basic_Program_Task_6.toBinary(2));
        assertEquals(11, Basic_Program_Task_6.toBinary(3));
        assertEquals(101, Basic_Program_Task_6.toBinary(5));
        assertNotEquals(10, Basic_Program_Task_6.toBinary(1));
        assertNotEquals(100, Basic_Program_Task_6.toBinary(2));
        assertNotEquals(110, Basic_Program_Task_6.toBinary(3));
        assertNotEquals(1010, Basic_Program_Task_6.toBinary(5));
    }
}
