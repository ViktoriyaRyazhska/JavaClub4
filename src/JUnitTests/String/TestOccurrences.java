package JUnitTests.String;

import Tasks.String.CountOfOccurrences.OccurrencesImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestOccurrences {
    @Test
    public void testOccurrences() {
        assertEquals(2, new OccurrencesImpl("dff", 'f').countOfOccurrences());
    }
}
