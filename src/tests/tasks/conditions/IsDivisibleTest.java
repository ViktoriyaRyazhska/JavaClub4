package tests.tasks.conditions;

import application.tasks.conditions.IsDivisible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsDivisibleTest {
    IsDivisible isDivisible = new IsDivisible();

    @Test
    void getIsDivisible() {
        assertEquals(true, isDivisible.getIsDivisible(12, 4, 3));
        assertEquals(false, isDivisible.getIsDivisible(3, 3, 4));
    }
}