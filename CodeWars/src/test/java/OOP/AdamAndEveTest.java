package OOP;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

class AdamAndEveTest {
    @Test
    public void test() {
        Human[] people = AdamAndEve.create();
        assertTrue(people[0] instanceof Human);
        assertTrue(people[1] instanceof Human);
    }

}