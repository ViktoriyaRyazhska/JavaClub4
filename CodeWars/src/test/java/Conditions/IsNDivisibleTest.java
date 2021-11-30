package Conditions;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


class IsNDivisibleTest {
    @Test
    public void test() {
        assertTrue(IsNDivisible.isDivisible(12, 3, 4));
        assertFalse(IsNDivisible.isDivisible(12, 5, 4));
    }
}