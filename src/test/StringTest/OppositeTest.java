package test.StringTest;

import org.junit.jupiter.api.Test;
import String.OppositeNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OppositeTest {
    @Test
    public void tests() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }
}