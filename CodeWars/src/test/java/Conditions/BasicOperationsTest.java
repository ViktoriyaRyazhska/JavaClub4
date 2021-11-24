package Conditions;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BasicOperationsTest {
    BasicOperations basicOps = new BasicOperations();

    @Test
    public void testBasics() {
        assertThat(basicOps.basicMath("+", 9, 8), is(17));
        assertThat(basicOps.basicMath("-", 15, 45), is(-30));
        assertThat(basicOps.basicMath("*", 5, 5), is(25));
        assertThat(basicOps.basicMath("/", 36, 6), is(6));
    }
}
