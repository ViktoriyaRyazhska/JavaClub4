package test_basic_program;
import basic_program.Basic_Program_Task_2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Basic_Program_Task_2 {
    @Test
    public void sampleTest() {
        assertEquals(4, Basic_Program_Task_2.multiply(2, 2));
        assertEquals(10, Basic_Program_Task_2.multiply(5, 2));
        assertEquals(100, Basic_Program_Task_2.multiply(100, 1));
        assertEquals(0, Basic_Program_Task_2.multiply(0, 1000));
    }
}
