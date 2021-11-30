package JUnitTests.Basics.DebugCelsiusConverter;

import Tasks.Basics.DebugCelsiusConverter.DebugCelsiusConverterImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DebugCelsiusConverterImplTest {

    @ParameterizedTest
    @DisplayName("Should check If fahrenheit >= -459.69 && fahrenheit <= 1000, then fahrenheit = input fahrenheit")
    @ValueSource(doubles = {-459.67, 70.0, 1000})
    void Should_CheckSetter_If(final double expectedNumbers){
       final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertEquals(expectedNumbers, debugCelsiusConverter.getFahrenheit());
    }

    @ParameterizedTest
    @DisplayName("Should check If !(fahrenheit >= -459.69 && fahrenheit <= 1000), then fahrenheit != input fahrenheit, but = [-459,67-1000]")
    @ValueSource(doubles = {-600.0, 2000.0})
    void Should_CheckSetter_Else(final double expectedNumbers){
        final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertNotEquals(expectedNumbers, debugCelsiusConverter.convertToCelsius());
        assertTrue(debugCelsiusConverter.getFahrenheit() >= -459.67 && debugCelsiusConverter.getFahrenheit() <= 1000);
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct celsius temperature")
    @ValueSource(doubles = {98.6})
    void Should_CheckConvertToCelsius(final double expectedNumbers){
        final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertEquals(37, debugCelsiusConverter.convertToCelsius());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct string(if clause)")
    @ValueSource(doubles = {5.0})
    void Should_CheckWeatherInfo_If(final double expectedNumbers){
        final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertEquals(-15.0 + " is a very cold temperature", debugCelsiusConverter.weatherInfo());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct string(else if 1)")
    @ValueSource(doubles = {32.0})
    void Should_CheckWeatherInfo_Else_If_1(final double expectedNumbers){
        final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertEquals( 0.0 + " is a cold temperature", debugCelsiusConverter.weatherInfo());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct string(else if 2)")
    @ValueSource(doubles = {59.0})
    void Should_CheckWeatherInfo_Else_If_2(final double expectedNumbers){
        final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertEquals(15.0 + " is a cool temperature", debugCelsiusConverter.weatherInfo());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct string(else if 3)")
    @ValueSource(doubles = {68.0})
    void Should_CheckWeatherInfo_Else_If_3(final double expectedNumbers){
        final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertEquals(20.0 + " is a warm temperature", debugCelsiusConverter.weatherInfo());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct string(else if 4)")
    @ValueSource(doubles = {77.0})
    void Should_CheckWeatherInfo_Else_If_4(final double expectedNumbers){
        final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertEquals(25.0 + " is a hot temperature", debugCelsiusConverter.weatherInfo());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct string(else clause)")
    @ValueSource(doubles = {104.0})
    void Should_CheckWeatherInfo_Else(final double expectedNumbers){
        final DebugCelsiusConverterImpl debugCelsiusConverter = new DebugCelsiusConverterImpl(expectedNumbers);
        assertEquals(40.0 + " is a very hot temperature", debugCelsiusConverter.weatherInfo());
    }
}