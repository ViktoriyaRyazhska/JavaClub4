package test_conditions;

import basic_program.Basic_Program_Task_7;
import conditions.Conditions_Task_7;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotEquals;

public class Test_Conditions_Task_7 {

    Conditions_Task_7 basicOps = new Conditions_Task_7();

    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(basicOps.basicMath("+", 4, 7), is(11));
        assertThat(basicOps.basicMath("-", 15, 18), is(-3));
        assertThat(basicOps.basicMath("*", 5, 5), is(25));
        assertThat(basicOps.basicMath("/", 49, 7), is(7));
        assertThat(basicOps.basicMath("/", 49, 7), is(7));

        assertNotEquals(java.util.Optional.of(99), basicOps.basicMath("+",24,9));
        assertNotEquals(java.util.Optional.of(30), basicOps.basicMath("-",46,15));
        assertNotEquals(java.util.Optional.of(10), basicOps.basicMath("/",100,5));
        assertNotEquals(java.util.Optional.of(26), basicOps.basicMath("*",5,5));
    }
}