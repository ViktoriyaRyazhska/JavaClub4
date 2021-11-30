package loops;

import org.junit.Test;
import tasks.loops.PrimeSequence;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PrimeSequenceTest {

    @Test
    public void primeSequenceTest() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(PrimeSequence.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(PrimeSequence.gap(4,100,110)));
        assertEquals(null, PrimeSequence.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(PrimeSequence.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(PrimeSequence.gap(10,300,400)));
    }
}
