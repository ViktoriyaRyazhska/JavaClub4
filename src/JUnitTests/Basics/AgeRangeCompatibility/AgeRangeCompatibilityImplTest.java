package JUnitTests.Basics.AgeRangeCompatibility;

import Tasks.Basics.AgeRangeCompatibility.AgeRangeCompatibilityImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AgeRangeCompatibilityImplTest {

    @ParameterizedTest
    @DisplayName("Should check If age >= 1 && age <= 100, then age = input age")
    @ValueSource(ints = {64, 20, 30})
    void Should_CheckSetter_If(final int expectedNumbers){
        final AgeRangeCompatibilityImpl ageRangeCompatibility = new AgeRangeCompatibilityImpl(expectedNumbers);
        assertEquals(expectedNumbers, ageRangeCompatibility.getAge());
    }

    @ParameterizedTest
    @DisplayName("Should check If !(age >= 1 && age <= 100), then age != input age, but = [1-100]")
    @ValueSource(ints = {10, -23, 104})
    void Should_CheckSetter_Else(final int expectedNumbers){
        final AgeRangeCompatibilityImpl ageRangeCompatibility = new AgeRangeCompatibilityImpl(expectedNumbers);
        assertNotEquals(expectedNumbers, ageRangeCompatibility.getAge());
        assertTrue(ageRangeCompatibility.getAge() >= 1 && ageRangeCompatibility.getAge() <= 100);
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct recommended range for dating(if clause)")
    @ValueSource(ints = {10, 12, 14})
    void Should_CheckStringRange_If(final int expectedNumbers){
        final AgeRangeCompatibilityImpl ageRangeCompatibility = new AgeRangeCompatibilityImpl(expectedNumbers);
        final int min = (int) (ageRangeCompatibility.getAge() * 0.9);
        final int max = (int) (ageRangeCompatibility.getAge() * 1.1);
        final String result = "[" + min + "]" + "-" + "[" + max + "]";
        assertEquals(result, ageRangeCompatibility.datingRange());
    }

    @ParameterizedTest
    @DisplayName("Should check If method return correct recommended range for dating(else clause)")
    @ValueSource(ints = {15, 75, 23})
    void Should_CheckStringRange_Else(final int expectedNumbers){
        final AgeRangeCompatibilityImpl ageRangeCompatibility = new AgeRangeCompatibilityImpl(expectedNumbers);
        final int min = (int) (ageRangeCompatibility.getAge() / 2.0) + 7;
        final int max = (ageRangeCompatibility.getAge() - 7) * 2;
        final String result = "[" + min + "]" + "-" + "[" + max + "]";
        assertEquals(result, ageRangeCompatibility.datingRange());
    }
}