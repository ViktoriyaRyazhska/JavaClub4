package test.BasicTest;

import Basic.ReturnNegative;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnNegativeTest {

    @Test
    void makeNegative() {
        assertEquals(-50, ReturnNegative.makeNegative(50));
    }
}