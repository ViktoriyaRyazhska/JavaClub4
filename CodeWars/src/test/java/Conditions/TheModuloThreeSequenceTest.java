package Conditions;


import org.junit.Test;

import static org.junit.Assert.assertEquals;



class TheModuloThreeSequenceTest {
    @Test
    public void test() {
        assertEquals(2, TheModuloThreeSequence.sequence(30));
        assertEquals(0, TheModuloThreeSequence.sequence(33));
        assertEquals(1, TheModuloThreeSequence.sequence(27));
    }

}