package test_loops;


import loops.Loops_Task_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Loops_Task_1 {
    @Test
    public void test4a() {
        assertEquals("aaaa", Loops_Task_1.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", Loops_Task_1.repeatStr(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", Loops_Task_1.repeatStr(5, ""));
    }

    @Test
    public void test0kata() {
        assertEquals("", Loops_Task_1.repeatStr(0, "kata"));
    }
}