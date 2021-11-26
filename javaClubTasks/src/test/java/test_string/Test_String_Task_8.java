package test_string;
import org.junit.Test;
import string.String_Task_8;

import static org.junit.Assert.assertEquals;

public class Test_String_Task_8 {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", String_Task_8.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", String_Task_8.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", String_Task_8.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", String_Task_8.tripleTrouble("LLh","euo","xtr"));
    }
}
