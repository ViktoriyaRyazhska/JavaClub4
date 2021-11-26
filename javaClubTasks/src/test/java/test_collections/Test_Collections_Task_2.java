package test_collections;
import collections.Collections_Task_2;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class Test_Collections_Task_2 {

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), Collections_Task_2.Collections_Task_2(1));
        assertEquals(Arrays.asList(1,2), Collections_Task_2.Collections_Task_2(2));
        assertEquals(Arrays.asList(1,2,3), Collections_Task_2.Collections_Task_2(3));
        assertEquals(Arrays.asList(1,2,3,4), Collections_Task_2.Collections_Task_2(4));
        assertEquals(Arrays.asList(1,2,3,4,5), Collections_Task_2.Collections_Task_2(5));
    }
}
