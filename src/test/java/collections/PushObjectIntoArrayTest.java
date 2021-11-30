package collections;

import org.junit.Test;
import tasks.сollections.PushObjectIntoArray;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PushObjectIntoArrayTest {

    @Test
    public void testSomething() {
        List<String> items = PushObjectIntoArray.push("an object");
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }
}
