package test.ConditionsTest;

import Conditions.DivisibleNb;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisibleNbTest {

    @Test
    public void twelveIsDivisibleBy4And3() {
        assertTrue(DivisibleNb.isDivisible(12,4,3));
    }

    @Test
    public void threeIsNotDivisibleBy3And4() {
        assertFalse(DivisibleNb.isDivisible(3,3,4));
    }

    @Test
    public void twentyIsDivisibleBy5And10() {
        assertTrue(DivisibleNb.isDivisible(20,5,10));
    }

    @Test
    public void oneHundredIsDivisibleBy50And10() {
        assertTrue(DivisibleNb.isDivisible(100,50,10));
    }
}