package test_basic_program;

import basic_program.Basic_Program_Task_1;
import org.junit.*;


public class Test_Basic_Program_Task_1{
    @Test
    public final void test_all() {
        Assert.assertEquals( "Nope!" , 4, Basic_Program_Task_1.doubleInteger(2));
        Assert.assertNotEquals( "Nope!" ,8 , Basic_Program_Task_1.doubleInteger(2));

    }
}
