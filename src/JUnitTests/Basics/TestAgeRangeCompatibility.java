package JUnitTests.Basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import Tasks.Basics.AgeRangeCompatibility.AgeRangeCompatibilityImpl;


public class TestAgeRangeCompatibility {

    @Test
    public void testAgeRangeCompatibility() {
        assertEquals("[18]-[32]", new AgeRangeCompatibilityImpl(23).datingRange());
    }
}
