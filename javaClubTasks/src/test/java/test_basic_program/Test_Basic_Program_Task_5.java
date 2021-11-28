package test_basic_program;

import basic_program.Basic_Program_Task_5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Basic_Program_Task_5 {
    @Test
    public void Test() {
        assertEquals("should greet some people normally", "Hello, Jim!", Basic_Program_Task_5.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", Basic_Program_Task_5.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", Basic_Program_Task_5.greet("Simon"));
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", Basic_Program_Task_5.greet("Johnny"));
    }
}