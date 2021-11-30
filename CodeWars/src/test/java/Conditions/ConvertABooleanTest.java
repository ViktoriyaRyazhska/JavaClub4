package Collections;


import Conditions.ConvertABoolean;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


class ConvertABooleanTest {
    @Test
    public void test() {
        assertEquals("true", ConvertABoolean.convert(true));
        assertEquals("false", ConvertABoolean.convert(false));
    }
}