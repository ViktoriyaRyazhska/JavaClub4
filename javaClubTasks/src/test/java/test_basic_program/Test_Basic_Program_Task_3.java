package test_basic_program;

import basic_program.Basic_Program_Task_3;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Basic_Program_Task_3 {

    private static final double delta = 0.0001;

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, Basic_Program_Task_3.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(60, Basic_Program_Task_3.getVolumeOfCuboid(6, 2, 5), delta);
        assertNotEquals(200, Basic_Program_Task_3.getVolumeOfCuboid(4, 6, 9), delta);
        assertNotEquals(95, Basic_Program_Task_3.getVolumeOfCuboid(3, 6, 7), delta);
    }
}