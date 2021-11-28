package test_string;
import org.junit.Test;
import string.String_Task_14;
import static org.junit.Assert.assertEquals;

public class Test_String_Task_14 {
    @Test
    public void testSomething() {
        assertEquals(1, String_Task_14.strCount("Hello", 'o'));
        assertEquals(2, String_Task_14.strCount("Hello", 'l'));
        assertEquals(0, String_Task_14.strCount("",'z'));
    }
}
