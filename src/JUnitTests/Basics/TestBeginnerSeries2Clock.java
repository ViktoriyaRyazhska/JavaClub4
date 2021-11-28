package JUnitTests.Basics;

import static org.junit.Assert.assertEquals;

import Tasks.Basics.BeginnerSeries2Clock.BeginnerSeries2ClockImpl;
import org.junit.Test;

public class TestBeginnerSeries2Clock {
    @Test
    public void testBeginnerSeries2Clock() {
        assertEquals(36123000, new BeginnerSeries2ClockImpl(1,2,3).passedTime());
    }
}
