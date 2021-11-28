package JUnitTests.Basics;

import Tasks.Basics.DebugCelsiusConverter.DebugCelsiusConverterImpl;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;




public class TestDebugCelsiusConverter {
    @Test
    public void testDebugCelsiusConverter() {
        assertThat(new DebugCelsiusConverterImpl(40).convertToCelsius(), is(4.444444444444445));
    }
}
