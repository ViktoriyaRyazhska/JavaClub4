package test_classes;


import classes.Classes_Task_1;
import classes.Classes_Task_5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

import java.security.SecureRandom;
import java.math.BigInteger;

public class Test_Classes_Task_1 {
    @Test
    public void testSample() {
        Classes_Task_1 ed = new Classes_Task_1();
        assertEquals(
                0,
                ed.getNumber()
        );
    }
}