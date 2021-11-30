package Loops;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

class ReversedSequenceTest {
    @Test
    public void test() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ReversedSequence.reverse(5));
        assertArrayEquals(new int[]{3, 2, 1}, ReversedSequence.reverse(3));
    }
}