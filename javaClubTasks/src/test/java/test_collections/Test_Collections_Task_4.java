package test_collections;
import collections.Collections_Task_4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;

public class Test_Collections_Task_4 {
    @Test
    public void Tests()
    {
        Collections_Task_4 d = new Collections_Task_4();

        d.newEntry("Apple", "A fruit");
        assertEquals("A fruit", d.look("Apple"));

        d.newEntry("Soccer", "A sport");
        assertEquals("A sport", d.look("Soccer"));

        assertEquals("Cant find entry for Hi", d.look("Hi"));
        assertEquals("Cant find entry for Ball", d.look("Ball"));

        d.newEntry("soccer", "a sport");
        assertEquals("a sport", d.look("soccer"));


        // Unxpected Result
        assertNotEquals("A sport", d.look("Apple"));
        assertNotEquals("A fruit", d.look("Soccer"));
    }
}
