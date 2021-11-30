package tests.tasks.loops;

import application.tasks.loops.Summation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummationTest {
    Summation  summation =new Summation();
    @Test
    void summationTest() {
        assertEquals(1,summation.getSummation(1));
        assertEquals(36,summation.getSummation(8));
    }
}