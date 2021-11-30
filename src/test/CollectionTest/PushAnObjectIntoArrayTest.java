package test.CollectionTest;

import Collections.PushAnObjectIntoArray;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class PushAnObjectIntoArrayTest {

    @Test
    public void testAddedObject() {
        List<String> items = PushAnObjectIntoArray.push("an object");
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }

    @Test
    public void testAddedSecondObject() {
        List<String> items = PushAnObjectIntoArray.push("second object");
        assertEquals(1,items.size());
        assertEquals("second object", items.get(0));
    }

    @Test
    public void testEmpty() {
        List<String> items = PushAnObjectIntoArray.push("");
        assertEquals(1,items.size());
        assertEquals("", items.get(0));
    }
}