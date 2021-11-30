package tests.tasks.loops;

import application.tasks.loops.HowGoodAreYou;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowGoodAreYouTest {
    HowGoodAreYou howGoodAreYou = new HowGoodAreYou();
    @Test
    void betterThanAverageTest() {
        int[] classPoints = {4, 4, 4, 4};
        assertTrue(howGoodAreYou.getBetterThanAverage(classPoints, 5));
        assertFalse(howGoodAreYou.getBetterThanAverage(classPoints, 4));
    }
}