package test.java.classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncapsulationTest {
    @Test
    public void testSample() {
        tasks.classes.Encapsulation ed = new tasks.classes.Encapsulation();
        assertEquals(0,ed.getNumber());

    }
}
