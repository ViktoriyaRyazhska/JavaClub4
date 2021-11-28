package JUnitTests.Classes;

import Tasks.Classes.LombokEncapsulation.LombokEncapsulation;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;


public class TestLombokEncapsulation {
    LombokEncapsulation lombokEncapsulation = new LombokEncapsulation();
    @Test
    public void testLombokEncapsulation() {
        assertThat(lombokEncapsulation.getNumber(), is(0));
        assertEquals(null, lombokEncapsulation.getStringValue());
        assertEquals(null, lombokEncapsulation.getAnObject());
    }
}
