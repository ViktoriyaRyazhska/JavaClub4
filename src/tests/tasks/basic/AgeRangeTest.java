package tests.tasks.basic;

import application.tasks.basic.AgeRange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeRangeTest {
AgeRange ageRange = new AgeRange();
    @Test
    void ageRangeTest() {
        assertEquals("15-20",ageRange.getOutput(17));
        assertEquals("27-66",ageRange.getOutput(40));
        assertEquals("14-16",ageRange.getOutput(15));
        assertEquals("24-56",ageRange.getOutput(35));
        assertEquals("9-11",ageRange.getOutput(10));
    }
}