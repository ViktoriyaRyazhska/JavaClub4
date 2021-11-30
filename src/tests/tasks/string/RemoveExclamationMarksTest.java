package tests.tasks.string;

import application.tasks.string.RemoveExclamationMarks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveExclamationMarksTest {
    RemoveExclamationMarks object = new RemoveExclamationMarks();
    @Test
    void removeTest() {
        assertEquals("Hello world", object.getRemove("Hello! world", 1), "Hello! world");
        assertEquals("hello!", object.getRemove("he!l!lo!!!!", 5), "he!l!lo!!!");
    }
}