package JUnitTests.Classes;

import Tasks.Classes.FixStaticElectrickery.FixStaticElectrickeryImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestFixStaticElectrickery {
    @Test
    public void testFixStaticElectrickery() {
        assertEquals(102, new FixStaticElectrickeryImpl(2).plus100());
    }
}
