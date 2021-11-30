package Loops;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

class MyHeadIsAtTheWrongEndTest {
    @Test
    public void test() {

        assertArrayEquals(new String[]{"3", "2", "1"}, MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{"1", "2", "3"}));
        assertArrayEquals(new String[]{"7", "8"}, MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{"8", "7"}));
    }
}