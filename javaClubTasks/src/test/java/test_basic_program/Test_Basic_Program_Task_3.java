package test_basic_program;

import basic_program.Basic_Task_3;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Basic_Program_Task_3 {

    private static final double delta = 0.0001;

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, Basic_Task_3.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, Basic_Task_3.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}