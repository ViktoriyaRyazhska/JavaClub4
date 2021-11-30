package conditions;

import org.junit.Test;
import tasks.conditions.BooleanToString;

import static org.junit.Assert.assertEquals;

public class BooleanToStringTest {

    @Test
    public void booleanToStringTest(){

        assertEquals(BooleanToString.convert(true), "true");
        assertEquals(BooleanToString.convert(false), "false");


    }
}
