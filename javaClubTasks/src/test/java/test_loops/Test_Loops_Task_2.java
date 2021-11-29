package test_loops;
import loops.Loops_Task_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Loops_Task_2 {
    @Test
    public void one() {assertArrayEquals(new int[]{1,15,15}, Loops_Task_2.humanYearsCatYearsDogYears(1));}

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,24,24}, Loops_Task_2.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,56,64}, Loops_Task_2.humanYearsCatYearsDogYears(10));
    }
}
