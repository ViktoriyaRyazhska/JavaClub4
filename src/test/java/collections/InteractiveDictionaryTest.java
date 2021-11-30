package collections;

import org.junit.Assert;
import org.junit.Test;
import tasks.сollections.InteractiveDictionary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InteractiveDictionaryTest {
    @Test
    public void interactiveDictionaryTest(){
        InteractiveDictionary d = new InteractiveDictionary();

        d.newEntry("Apple", "A fruit");
        assertEquals("A fruit", d.look("Apple"));

        d.newEntry("Soccer", "A sport");
        assertEquals("A sport", d.look("Soccer"));

        assertEquals("Cant find entry for Hi", d.look("Hi"));
        assertEquals("Cant find entry for Ball", d.look("Ball"));

        d.newEntry("soccer", "a sport");
        assertEquals("a sport", d.look("soccer"));

        d.newEntry("car", "garage");
        assertNotEquals("sd'g", d.look("car"));

        d.newEntry("map", "compass");
        assertNotEquals("yre3y", d.look("map"));

        d.newEntry("bed", "chair");
        assertNotEquals("fgdg", d.look("chair"));
    }
}
