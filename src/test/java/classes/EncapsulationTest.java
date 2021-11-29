package classes;

import org.junit.Test;
import tasks.classes.Encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EncapsulationTest {
    @Test
    public void encapsulationTest() {
       Encapsulation ed = new Encapsulation();
        assertEquals(0, ed.getNumber());
        assertNotEquals(1, ed.getNumber());

    }
}
