package tests.tasks.conditions;

import application.tasks.conditions.WillBeEnoughSpace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WillBeEnoughSpaceTest {
WillBeEnoughSpace  willBeEnoughSpace  = new WillBeEnoughSpace();
    @Test
    void willBeEnoughSpaceTest() {
        assertEquals("Can fit all 5 passengers",willBeEnoughSpace.getOutPut(10,5,5));
        assertEquals("Can fit all 5 passengers",willBeEnoughSpace.getOutPut(20,5,5));
        assertEquals("Can`t fit 10 of the 50 passengers",willBeEnoughSpace.getOutPut(100,60,50));
    }
}