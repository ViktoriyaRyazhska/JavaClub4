package Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class Sticks21Test {
    @Test
    public void test() {
        assertEquals(2, Sticks21.makeMove(18));
        assertEquals(1, Sticks21.makeMove(17));
        assertEquals(3, Sticks21.makeMove(19));
    }
}