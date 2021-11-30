package conditions;

import org.junit.Test;
import tasks.conditions.OppositeNumber;

import static org.junit.Assert.assertEquals;

public class OppositeNumberTest {

    @Test
    public void oppositeNumberTest() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }
}
