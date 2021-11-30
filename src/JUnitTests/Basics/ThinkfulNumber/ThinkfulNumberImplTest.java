package JUnitTests.Basics.ThinkfulNumber;

import Tasks.Basics.ThinkfulNumber.ThinkfulNumberImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ThinkfulNumberImplTest {

    @ParameterizedTest
    @DisplayName("Should check If wall = input wall")
    @CsvSource({
            "126,      3"
    })
    void Should_CheckWallSetter_If(final int wall, final int pixel){
        final ThinkfulNumberImpl thinkfulNumber = new ThinkfulNumberImpl(wall, pixel);
        assertEquals(wall, thinkfulNumber.getWallSize());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(wall, 1) = 1")
    @CsvSource({
            "-126,      3"
    })
    void Should_CheckWallSetter_Else(final int wall, final int pixel){
        final ThinkfulNumberImpl thinkfulNumber = new ThinkfulNumberImpl(wall, pixel);
        assertEquals(Math.max(wall, 1), thinkfulNumber.getWallSize());
    }

    @ParameterizedTest
    @DisplayName("Should check If pixel = input pixel")
    @CsvSource({
            "126,      3"
    })
    void Should_CheckPixelSetter_If(final int wall, final int pixel){
        final ThinkfulNumberImpl thinkfulNumber = new ThinkfulNumberImpl(wall, pixel);
        assertEquals(pixel, thinkfulNumber.getPixelSize());
    }

    @ParameterizedTest
    @DisplayName("Should check If Math.max(pixel, 1) = 1")
    @CsvSource({
            "126,      -3"
    })
    void Should_CheckPixelSetter_Else(final int wall, final int pixel){
        final ThinkfulNumberImpl thinkfulNumber = new ThinkfulNumberImpl(wall, pixel);
        assertEquals(Math.max(pixel, 1), thinkfulNumber.getPixelSize());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return false")
    @CsvSource({
            "126,      2"
    })
    void Should_CheckIsDivisible_True(final int wall, final int pixel){
        final ThinkfulNumberImpl thinkfulNumber = new ThinkfulNumberImpl(wall, pixel);
        assertTrue(thinkfulNumber.isDivisible());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return true")
    @CsvSource({
            "125,      2"
    })
    void Should_CheckIsDivisible_False(final int wall, final int pixel){
        final ThinkfulNumberImpl thinkfulNumber = new ThinkfulNumberImpl(wall, pixel);
        assertFalse(thinkfulNumber.isDivisible());
    }
}