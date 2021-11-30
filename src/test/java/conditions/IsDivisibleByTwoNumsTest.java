package conditions;

import org.junit.Test;
import tasks.conditions.IsDivisibleByTwoNums;

import static org.junit.Assert.*;

public class IsDivisibleByTwoNumsTest {

    @Test
    public void isDivisibleByTwoNumsTest(){
        assertTrue(IsDivisibleByTwoNums.isDivisible(12, 4, 3));
        assertFalse(IsDivisibleByTwoNums.isDivisible(3, 3, 4));
    }
}
