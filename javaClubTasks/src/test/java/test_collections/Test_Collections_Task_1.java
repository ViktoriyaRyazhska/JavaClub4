package test_collections;


import collections.Collections_Task_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import java.util.List;

public class Test_Collections_Task_1 {

    @Test
    public void testSomething() {
        List<String> items = Collections_Task_1.push();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
        assertNotEquals("kola klishch", items.get(0));
        assertNotEquals(7, items.size());
    }
}
