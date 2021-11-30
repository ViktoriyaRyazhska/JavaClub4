package test.BasicTest;

import Basic.JennysSecretMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JennysSecretMessageTest {

    @Test
    void greet() {
        assertEquals("Hello, Jim!", JennysSecretMessage.greet("Jim"));
        assertEquals("Hello, my love!", JennysSecretMessage.greet("Johnny"));
    }
}