package test_basic_program;
import basic_program.Basic_Program_Task_10;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Basic_Program_Task_10 {
    @Test
    public void exampleTests(){
        assertEquals("15-20", Basic_Program_Task_10.datingRange(17));
        assertEquals("27-66", Basic_Program_Task_10.datingRange(40));
        assertEquals("14-16", Basic_Program_Task_10.datingRange(15));
        assertEquals("24-56", Basic_Program_Task_10.datingRange(35));
        assertEquals("9-11", Basic_Program_Task_10.datingRange(10));
        assertNotEquals("16-20", Basic_Program_Task_10.datingRange(17));
        assertNotEquals("270-66", Basic_Program_Task_10.datingRange(40));
        assertNotEquals("14-916", Basic_Program_Task_10.datingRange(15));
        assertNotEquals("245-56", Basic_Program_Task_10.datingRange(35));
        assertNotEquals("89-11", Basic_Program_Task_10.datingRange(10));
    }
}
