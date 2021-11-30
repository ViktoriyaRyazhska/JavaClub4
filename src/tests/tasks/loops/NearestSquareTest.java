package tests.tasks.loops;

import application.tasks.loops.NearestSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NearestSquareTest {
    NearestSquare nearestSquare = new NearestSquare();

    @Test
    void nearestSquareTest() {
        assertEquals(1, nearestSquare.getFindSquareNumber(1));
        assertEquals(1, nearestSquare.getFindSquareNumber(2));
        assertEquals(9, nearestSquare.getFindSquareNumber(10));
        assertEquals(121, nearestSquare.getFindSquareNumber(111));
        assertEquals(10000, nearestSquare.getFindSquareNumber(9999));
    }
}