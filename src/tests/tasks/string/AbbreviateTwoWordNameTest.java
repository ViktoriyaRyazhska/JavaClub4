package tests.tasks.string;

import application.tasks.string.AbbreviateTwoWordName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbbreviateTwoWordNameTest {
    AbbreviateTwoWordName object = new AbbreviateTwoWordName();
    @Test
    void correctTest() {
        assertEquals("H.W", object.getCorrect("hello world"), "hello world");
        assertEquals("H.W", object.getCorrect("Hello World"), "Hello World");
        assertEquals("H.W", object.getCorrect("hello, world"), "hello, world");
    }
}