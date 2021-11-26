package test_basic_program;
import basic_program.Basic_Program_Task_4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Test_Basic_Program_Task_4 {
    @Test
    public void FixedTests() {
        assertEquals(18, Basic_Program_Task_4.century(1705));
        assertEquals(19, Basic_Program_Task_4.century(1900));
        assertEquals(17, Basic_Program_Task_4.century(1601));
        assertEquals(20, Basic_Program_Task_4.century(2000));
        assertEquals(1,  Basic_Program_Task_4.century(89));
    }
}
