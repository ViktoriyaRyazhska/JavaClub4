package JUnitTests.Classes.FixStaticElectrickery;

import Tasks.Classes.FixStaticElectrickery.FixStaticElectrickeryImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FixStaticElectrickeryImplTest {

    @ParameterizedTest
    @DisplayName("Should check If method return correct value")
    @ValueSource(ints = {-52, 28, 0})
    void Should_CheckPlusHundred(final int n){
        final FixStaticElectrickeryImpl fixStaticElectrickery = new FixStaticElectrickeryImpl(n);
        assertEquals(100 + n, fixStaticElectrickery.plus100());
    }
}