package tests.tasks.conditions;

import application.tasks.conditions.OppositeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OppositeNumberTest {
    OppositeNumber oppositeNumber = new OppositeNumber();

    @Test
    void OppositeNumberTest() {
        assertEquals(-1,oppositeNumber.getOpposite(1));
    }
}