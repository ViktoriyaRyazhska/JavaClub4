package conditions;

import org.junit.Test;
import tasks.conditions.OppositesAttract;

import static org.junit.Assert.*;

public class OppositesAttractTest {

    @Test
    public void oppositesAttractTest() {
        assertTrue(OppositesAttract.isLove(1, 4));
        assertFalse(OppositesAttract.isLove(2, 2));
        assertFalse(OppositesAttract.isLove(1, 1));
        assertTrue(OppositesAttract.isLove(0, 1));
    }
}
