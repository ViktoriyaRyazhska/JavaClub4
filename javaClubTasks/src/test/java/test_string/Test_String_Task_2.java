package test_string;
import org.junit.Test;
import string.String_Task_2;
import static org.junit.Assert.*;

public class Test_String_Task_2 {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", String_Task_2.solution("world"));
        assertNotEquals("dlrowes", String_Task_2.solution("world"));
    }
}
