package test_collections;
import collections.Collections_Task_2;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class Test_Collections_Task_2 {

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), Collections_Task_2.Collections_Task_2(1));
        assertEquals(Arrays.asList(1,2), Collections_Task_2.Collections_Task_2(2));
        assertEquals(Arrays.asList(1,2,3), Collections_Task_2.Collections_Task_2(3));
        assertEquals(Arrays.asList(1,2,3,4), Collections_Task_2.Collections_Task_2(4));
        assertEquals(Arrays.asList(1,2,3,4,5), Collections_Task_2.Collections_Task_2(5));
        assertNotEquals(Arrays.asList(2), Collections_Task_2.Collections_Task_2(1));
        assertNotEquals(Arrays.asList(12,2), Collections_Task_2.Collections_Task_2(2));
        assertNotEquals(Arrays.asList(1,23,3), Collections_Task_2.Collections_Task_2(3));
        assertNotEquals(Arrays.asList(11,2,3,4), Collections_Task_2.Collections_Task_2(4));
        assertNotEquals(Arrays.asList(1,2,32,4,5), Collections_Task_2.Collections_Task_2(5));
    }
}
