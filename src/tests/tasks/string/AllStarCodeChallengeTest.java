package tests.tasks.string;

import application.tasks.string.AllStarCodeChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllStarCodeChallengeTest {
    AllStarCodeChallenge object = new AllStarCodeChallenge();
    @Test
    void strCountTest() {
        assertEquals(2, object.getStrCount("hello", 'l'), "l in hello");
        assertEquals(0, object.getStrCount("o", 'l'), "l in o");
        assertEquals(1, object.getStrCount("hello, world", ','), ", in hello, world");
    }
}