package test_classes;
import classes.Classes_Task_6;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Classes_Task_6 {
    @Test
    public void testBasicBlock() throws Exception {
        Classes_Task_6 b = new Classes_Task_6(new int[]{2,2,2});
        assertEquals(2,b.getWidth());
        assertEquals(2,b.getLength());
        assertEquals(2,b.getHeight());
        assertEquals(8,b.getVolume());
        assertEquals(24,b.getSurfaceArea());
        assertNotEquals(3,b.getWidth());
        assertNotEquals(3,b.getLength());
        assertNotEquals(3,b.getHeight());
        assertNotEquals(9,b.getVolume());
        assertNotEquals(30,b.getSurfaceArea());
    }
}
