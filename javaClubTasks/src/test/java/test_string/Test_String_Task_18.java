package test_string;
import org.junit.Test;
import string.String_Task_18;
import static org.junit.Assert.assertEquals;

public class Test_String_Task_18 {
    @Test
    public void fixedTests() {
        // assertEquals("expected", "actual");
        assertEquals("Hi", String_Task_18.remove("Hi!", 1));
        assertEquals("Hi", String_Task_18.remove("Hi!", 100));
        assertEquals("Hi!!", String_Task_18.remove("Hi!!!", 1));
        assertEquals("Hi", String_Task_18.remove("Hi!!!", 100));
        assertEquals("Hi", String_Task_18.remove("!Hi", 1));
        assertEquals("Hi!", String_Task_18.remove("!Hi!", 1));
        assertEquals("Hi", String_Task_18.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", String_Task_18.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", String_Task_18.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", String_Task_18.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", String_Task_18.remove("!!!Hi !!hi!!! !hi", 100));
    }
}
