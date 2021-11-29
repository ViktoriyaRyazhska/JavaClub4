package test.java.basic;

import org.junit.Test;
import tasks.basic.IsDivisible;

import static org.junit.Assert.*;

public class IsDivisibleTest {
    @Test(expected = Exception.class)
    public void fixedTests() throws Exception {
        Object object = null;
        assertTrue(IsDivisible.isDivisible(4050,27));
        assertTrue(IsDivisible.isDivisible(10000,20));
        assertTrue(IsDivisible.isDivisible(10005,1));
        assertFalse(IsDivisible.isDivisible(4066,27));
        assertFalse(IsDivisible.isDivisible(10005,2));
        assertNull(IsDivisible.isDivisible(200,(int)object));
        assertTrue(IsDivisible.isDivisible(200,0));
        
    }
}
