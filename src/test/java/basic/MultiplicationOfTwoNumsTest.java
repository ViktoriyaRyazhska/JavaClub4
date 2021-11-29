package test.java.basic;

import org.junit.Test;
import tasks.basic.MultiplicationOfTwoNums;

import static org.junit.Assert.assertEquals;

public class MultiplicationOfTwoNumsTest {
    @Test
    public void sampleTest() {
        assertEquals(4, MultiplicationOfTwoNums.multiply(2, 2));
        assertEquals(10, MultiplicationOfTwoNums.multiply(5, 2));
        assertEquals(100, MultiplicationOfTwoNums.multiply(100, 1));
        assertEquals(0, MultiplicationOfTwoNums.multiply(0, 1000));
    }
}
