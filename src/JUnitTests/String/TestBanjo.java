package JUnitTests.String;

import Tasks.String.Banjo.BanjoImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestBanjo {
    @Test
    public void test() {
        assertEquals("Nazar does not play banjo", new BanjoImpl("Nazar").playingBanjo());
    }
}
