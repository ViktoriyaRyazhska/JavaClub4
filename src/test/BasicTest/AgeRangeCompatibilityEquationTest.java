package test.BasicTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Basic.*;

class AgeRangeCompatibilityEquationTest {

    @Test
    void compatibilityEquation() {
        assertEquals("15-20", AgeRangeCompatibilityEquation.CompatibilityEquation(17));
        assertEquals("27-66", AgeRangeCompatibilityEquation.CompatibilityEquation(40));
        assertEquals("14-16", AgeRangeCompatibilityEquation.CompatibilityEquation(15));
        assertEquals("24-56", AgeRangeCompatibilityEquation.CompatibilityEquation(35));
        assertEquals("9-11", AgeRangeCompatibilityEquation.CompatibilityEquation(10));
    }
}