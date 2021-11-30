package Collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class InteractiveDictionaryTest {
    @Test
    public void test() {
        InteractiveDictionary.Dictionary map = new InteractiveDictionary.Dictionary();
        InteractiveDictionary.Dictionary.newEntry("a", "apple");
        InteractiveDictionary.Dictionary.newEntry("b", "banana");
        InteractiveDictionary.Dictionary.newEntry("c", "cinema");
        assertEquals("apple", map.look("a"));
        assertEquals("banana", map.look("b"));
        assertEquals("cinema", map.look("c"));
    }
}