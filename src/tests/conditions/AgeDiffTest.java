package tests.conditions;

import application.tasks.conditions.AgeDiff;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class AgeDiffTest {
    AgeDiff ageDiff = new AgeDiff();
    @Test
    void calculateAgeTest() {
        try {
            Method method = AgeDiff.class.getDeclaredMethod("calculateAge", int.class, int.class);
            assertEquals("You are 10 year(s) old", method.invoke(ageDiff, 2000, 2010), "birth == 2000, yearTo == 2010");
            assertEquals("You will be born in 10 year(s)", method.invoke(ageDiff, 2000, 2010), "birth == 2010, yearTo == 2000");
            assertEquals("You will be born 1 year(s)", method.invoke(ageDiff, 2000, 2010), "birth == 2021, yearTo == 2020");
            assertEquals("You were born this very year!", method.invoke(ageDiff, 2000, 2010), "birth == 2000, yearTo == 2000");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}