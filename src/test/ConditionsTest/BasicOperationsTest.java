package test.ConditionsTest;

import Conditions.BasicOperations;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicOperationsTest {

    @Test
    public void fourPlus7() {
        int expected = 11;
        int result = BasicOperations.basicMath("+",4,7);
        assertEquals(expected,result);
    }

    @Test
    public void fifteenMinusEighteen() {
        int expected = -3;
        int result = BasicOperations.basicMath("-",15,18);
        assertEquals(expected,result);
    }

    @Test
    public void fiveMultiplyFive() {
        int expected = 25;
        int result = BasicOperations.basicMath("*",5,5);
        assertEquals(expected,result);
    }

    @Test
    public void fortyEightDivisionSeven() {
        int expected = 7;
        int result = BasicOperations.basicMath("/",49,7);
        assertEquals(expected,result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void incorrectValueInput(){
        BasicOperations.basicMath("fdfd",49,7);
    }
}