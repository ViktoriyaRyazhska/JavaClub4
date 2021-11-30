package tests.tasks.string;

import application.tasks.string.Welcome;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeTest {
    Welcome welcome = new Welcome();
    List<String> name = Arrays.asList("John", "Smith");

    @Test
    void welcomeTest() {
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!", welcome.getWelcome("Phoenix", "Arizona", name)
        );
    }
}