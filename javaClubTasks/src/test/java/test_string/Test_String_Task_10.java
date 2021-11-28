package test_string;
import org.junit.Test;
import string.String_Task_10;
import static org.junit.Assert.assertEquals;

public class Test_String_Task_10 {
    @Test
    public void testSomething() {
        String_Task_10 fakeBinary = new String_Task_10();
        assertEquals("01011110001100111", fakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin("366058562030849490134388085"));
    }
}
