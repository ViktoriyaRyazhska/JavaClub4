package test.ClassesTest;

import Classes.Fraction;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
public class FractionTest {


    @Test
    void fractionTest() {
        assertEquals(new Fraction(37, 40), new Fraction(1, 8).add(new Fraction(4, 5)));
    }
}
