package JUnitTests.Basics.JennySecretMessage;

import Tasks.Basics.JennySecretMessage.JennySecretMessageImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class JennySecretMessageImplTest {

    @ParameterizedTest
    @DisplayName("Should check If input = null, then name = 'Michael'")
    @NullAndEmptySource
    void Should_CheckSetter_If_null(final String expectedString) {
        final JennySecretMessageImpl jennySecretMessage = new JennySecretMessageImpl(expectedString);
        assertEquals("Michael", jennySecretMessage.getName());
    }

    @ParameterizedTest
    @DisplayName("Should check If input name.matches(), then name = input name")
    @ValueSource(strings = {"Maksym", "Oleg", "Nazar"})
    void Should_CheckSetter_If_matches(final String expectedString) {
        final JennySecretMessageImpl jennySecretMessage = new JennySecretMessageImpl(expectedString);
        assertEquals(expectedString, jennySecretMessage.getName());
    }

    @ParameterizedTest
    @DisplayName("Should check If input !name.matches(), then name = 'Michael'")
    @ValueSource(strings = {"mAKsym"})
    void Should_CheckSetter_Else(final String expectedString) {
        final JennySecretMessageImpl jennySecretMessage = new JennySecretMessageImpl(expectedString);
        assertEquals("Michael", jennySecretMessage.getName());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct message(if clause)")
    @ValueSource(strings = {"Johnny"})
    void Should_CheckToGreet_If(final String expectedString) {
        final JennySecretMessageImpl jennySecretMessage = new JennySecretMessageImpl(expectedString);
        assertEquals("Hello, my love!", jennySecretMessage.toGreet());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct message(else clause)")
    @ValueSource(strings = {"Nazar"})
    void Should_CheckToGreet_Else(final String expectedString) {
        final JennySecretMessageImpl jennySecretMessage = new JennySecretMessageImpl(expectedString);
        assertEquals("Hello, " + expectedString + "!", jennySecretMessage.toGreet());
    }
}