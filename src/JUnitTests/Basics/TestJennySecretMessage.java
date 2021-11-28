package JUnitTests.Basics;

import Tasks.Basics.JennySecretMessage.JennySecretMessageImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJennySecretMessage {
    @Test
    public void testJennySecretMessage() {
        assertEquals("Hello, Nazar!", new JennySecretMessageImpl("Nazar").toGreet());
    }
}
