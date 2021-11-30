package tests.tasks.conditions;

import application.tasks.conditions.AgeDiff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeDiffTest {
    AgeDiff ageDiff = new AgeDiff();
    @Test
    void calculateAgeTest() {
        assertEquals("You are 10 year(s) old", ageDiff.getCalculateAge(2000, 2010), "birth == 2000, yearTo == 2010");
        assertEquals("You will be born in 2030 and in 2045 you will be 15 year(s) old", ageDiff.getCalculateAge(2030, 2045), "birth == 2030, yearTo == 2045");
        assertEquals("You were born this very year!", ageDiff.getCalculateAge(2000, 2000), "birth == 2000, yearTo == 2000");
    }
}