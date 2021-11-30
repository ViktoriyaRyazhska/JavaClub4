package tests.tasks.loops;

import application.tasks.loops.ReversedSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedSequenceTest {
    ReversedSequence reversedSequence = new ReversedSequence();
    @Test
    void reverseTest() {
        int[] result1 = {5, 4, 3, 2, 1};
        int[] result2 = {3, 2, 1};

        assertArrayEquals(result1, reversedSequence.getReverse(5), "n == 5");
        assertArrayEquals(result2, reversedSequence.getReverse(3), "3 == 5");
    }
}