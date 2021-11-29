package tests.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.basic.JennySecretMessage;

import java.lang.reflect.Method;

public class JennySecretMessageTest {
    JennySecretMessage jennySecretMessage = new JennySecretMessage();
    @Test
    void greetTest() {
        String result = "Hello, my love!";
        assertEquals(result, jennySecretMessage.getGreet("Johnny"), "Johnny");
        assertEquals(result, jennySecretMessage.getGreet("johnny"), "johnny");
        assertEquals(result, jennySecretMessage.getGreet("joHnny"), "joHnny");
        assertEquals("Hello, Tom!",jennySecretMessage.getGreet("Tom"), "Tom");
    }
}
