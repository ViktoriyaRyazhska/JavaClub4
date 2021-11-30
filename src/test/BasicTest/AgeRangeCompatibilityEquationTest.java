package test.BasicTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Basic.*;

class AgeRangeCompatibilityEquationTest {

    @Test
    public void fifteenTwenty() {
        String expected = "15-20";
        String result = AgeRangeCompatibilityEquation.CompatibilityEquation(17);
        assertEquals(expected, result);
    }

    @Test
    public void twentySevenSixtySix() {
        String expected = "27-66";
        String result = AgeRangeCompatibilityEquation.CompatibilityEquation(40);
        assertEquals(expected, result);
    }
    @Test
    public void fourteenSixteen() {
        String expected = "14-16";
        String result = AgeRangeCompatibilityEquation.CompatibilityEquation(15);
        assertEquals(expected, result);
    }

    @Test
    public void twentyFourFiftySix() {
        String expected = "24-56";
        String result = AgeRangeCompatibilityEquation.CompatibilityEquation(35);
        assertEquals(expected, result);
    }

    @Test
    public void nineEleven() {
        String expected = "9-11";
        String result = AgeRangeCompatibilityEquation.CompatibilityEquation(10);
        assertEquals(expected, result);
    }
}