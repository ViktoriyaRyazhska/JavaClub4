package test_classes;
import classes.Classes_Task_2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Classes_Task_2 {
    @Test
    public void test() {
        System.out.println(Classes_Task_2.INST.plus100(23));
        // Err... was that right?
    }
}
