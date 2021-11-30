package loops;

import org.junit.Test;
import tasks.loops.TwiceAsOld;

import static org.junit.Assert.assertEquals;

public class TwiceAsOldTest {
    TwiceAsOld twiceAsOld = new TwiceAsOld();

    @Test
    public void twiceAsOldTest() {
        assertEquals(30, twiceAsOld.twiceAsOld(30,0));
        assertEquals(16, twiceAsOld.twiceAsOld(30,7));
        assertEquals(15, twiceAsOld.twiceAsOld(45,30));

    }
}
