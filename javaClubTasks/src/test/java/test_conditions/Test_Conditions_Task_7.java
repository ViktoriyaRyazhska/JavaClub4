package test_conditions;

import conditions.Conditions_Task_7;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Test_Conditions_Task_7 {

    Conditions_Task_7 basicOps = new Conditions_Task_7();

    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(basicOps.basicMath("+", 4, 7), is(11));
        assertThat(basicOps.basicMath("-", 15, 18), is(-3));
        assertThat(basicOps.basicMath("*", 5, 5), is(25));
        assertThat(basicOps.basicMath("/", 49, 7), is(7));
    }
}