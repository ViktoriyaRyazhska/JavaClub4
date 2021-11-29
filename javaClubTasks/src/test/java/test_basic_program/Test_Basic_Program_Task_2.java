package test_basic_program;
import basic_program.Basic_Program_Task_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Basic_Program_Task_2 {
    @Test
    public void sampleTest() {
        assertEquals(4, Basic_Program_Task_2.multiply(2, 2));
        assertEquals(10, Basic_Program_Task_2.multiply(5, 2));
        assertEquals(100, Basic_Program_Task_2.multiply(100, 1));
        assertEquals(0, Basic_Program_Task_2.multiply(0, 1000));
        assertNotEquals(5, Basic_Program_Task_2.multiply(2, 2));
        assertNotEquals(100, Basic_Program_Task_2.multiply(5, 2));
        assertNotEquals(1000, Basic_Program_Task_2.multiply(100, 1));
        assertNotEquals(1, Basic_Program_Task_2.multiply(0, 1000));
    }
}
