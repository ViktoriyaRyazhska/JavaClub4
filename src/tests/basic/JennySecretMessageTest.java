package tests.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.basic.JennySecretMessage;

import java.lang.reflect.Method;

public class JennySecretMessageTest {
    JennySecretMessage jennySecretMessage = new JennySecretMessage();
    @Test
    void greetTest() {
        try {
            Method method = JennySecretMessage.class.getDeclaredMethod("greet", String.class);
            assertEquals("Hello, my love!", method.invoke(jennySecretMessage, "Johnny").toString(), "Johnny");
            assertEquals("Hello, my love!", method.invoke(jennySecretMessage, "johnny").toString(), "johnny");
            assertEquals("Hello, my love!", method.invoke(jennySecretMessage, "joHnny").toString(), "joHnny");
            assertEquals("Hello, Tom!", method.invoke(jennySecretMessage, "Tom").toString(), "Tom");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
