package loops;

import org.junit.Test;
import tasks.loops.Sequence;

import static org.junit.Assert.assertArrayEquals;

public class SequenceTest {
    @Test
    public void sequenceTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, Sequence.reverse(5));
    }
}
