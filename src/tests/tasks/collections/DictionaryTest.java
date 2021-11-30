package tests.tasks.collections;

import application.tasks.collections.Dictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    Dictionary dictionary = new Dictionary("apple", "fruit");
    @Test
    void DictionaryTest() {
        dictionary.newEntry("potato", "not a fruit");
        assertEquals("not a fruit", dictionary.look("potato"), "potato");
        assertEquals("fruit", dictionary.look("apple"), "apple");
    }
}