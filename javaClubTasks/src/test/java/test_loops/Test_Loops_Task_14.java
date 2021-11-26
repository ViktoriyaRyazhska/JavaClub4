package test_loops;
import static org.junit.Assert.*;
import java.util.Arrays;

import loops.Loops_Task_14;
import org.junit.Test;

public class Test_Loops_Task_14 {
    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(Loops_Task_14.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(Loops_Task_14.gap(4,100,110)));
        assertEquals(null, Loops_Task_14.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(Loops_Task_14.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(Loops_Task_14.gap(10,300,400)));
    }
}
