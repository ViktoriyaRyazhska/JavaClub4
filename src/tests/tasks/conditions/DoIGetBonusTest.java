package tests.tasks.conditions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.conditions.DoIGetBonus;

public class DoIGetBonusTest {
    DoIGetBonus doIGetBonus = new DoIGetBonus();
    @Test
    void bonusTimeTest() {
        assertEquals("100", doIGetBonus.getBonusTime(10, true), "salary == 10, bonus == true");
        assertEquals("10", doIGetBonus.getBonusTime(10, false), "salary == 10, bonus == false");
        assertEquals("1230", doIGetBonus.getBonusTime(123, true), "salary == 123, bonus == true");
    }
}
