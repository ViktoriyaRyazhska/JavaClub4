package tests.tasks.collections;

import application.tasks.collections.UnfinishedLoop;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UnfinishedLoopTest {
    UnfinishedLoop unfinishedLoop = new UnfinishedLoop();
    @Test
    void unfinishedLoopTest() {
        assertEquals(Arrays.asList(1),unfinishedLoop.getCreatedList(1));
        assertEquals(Arrays.asList(1,2),unfinishedLoop.getCreatedList(2));
        assertEquals(Arrays.asList(1,2,3),unfinishedLoop.getCreatedList(3));
        assertEquals(Arrays.asList(1,2,3,4),unfinishedLoop.getCreatedList(4));
        assertEquals(Arrays.asList(1,2,3,4,5),unfinishedLoop.getCreatedList(5));
    }
}