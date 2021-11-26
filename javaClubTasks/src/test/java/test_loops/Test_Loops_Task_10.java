package test_loops;
import loops.Loops_Task_10;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Test_Loops_Task_10 {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{ "head", "body", "tail" },
                Loops_Task_10.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{ "heads", "body", "tails" },
                Loops_Task_10.fixTheMeerkat(new String[]{ "tails", "body", "heads" }));
    }


    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{ "top", "middle", "bottom" },
                Loops_Task_10.fixTheMeerkat(new String[]{ "bottom", "middle", "top" }));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{ "upper legs", "torso", "lower legs" },
                Loops_Task_10.fixTheMeerkat(new String[]{ "lower legs", "torso", "upper legs" }));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{ "sky", "rainbow", "ground" },
                Loops_Task_10.fixTheMeerkat(new String[]{ "ground", "rainbow", "sky" }));
    }
}
