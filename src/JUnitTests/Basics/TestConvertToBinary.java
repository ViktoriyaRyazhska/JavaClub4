package JUnitTests.Basics;

import Tasks.Basics.ConvertToBinary.ConvertToBinaryImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestConvertToBinary {
    @Test
    public void testConvertToBinary() {
        assertEquals("10100", new ConvertToBinaryImpl(20).toBinary());
    }
}
