package collections;

import org.junit.Test;
import tasks.сollections.UnfinishedLoop;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class UnfinishedLoopTest {

    UnfinishedLoop k = new UnfinishedLoop();

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), k.CreateList(1));
        assertEquals(Arrays.asList(1,2), k.CreateList(2));
        assertEquals(Arrays.asList(1,2,3), k.CreateList(3));
        assertEquals(Arrays.asList(1,2,3,4), k.CreateList(4));
        assertEquals(Arrays.asList(1,2,3,4,5), k.CreateList(5));
    }
}
