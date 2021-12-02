package test.BasicTest;

import Basic.ThinkfulNumberDrillsPixelartPlanning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThinkfulNumberDrillsPixelartPlanningTest {

    @Test
    void isDivisible() {
        assertTrue(ThinkfulNumberDrillsPixelartPlanning.isDivisible(4050,27));
        assertTrue(ThinkfulNumberDrillsPixelartPlanning.isDivisible(10000,20));
        assertTrue(ThinkfulNumberDrillsPixelartPlanning.isDivisible(10005,1));
        assertFalse(ThinkfulNumberDrillsPixelartPlanning.isDivisible(4066,27));
        assertFalse(ThinkfulNumberDrillsPixelartPlanning.isDivisible(10005,2));
    }
}