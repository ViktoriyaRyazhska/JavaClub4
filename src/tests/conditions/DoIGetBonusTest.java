package tests.conditions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import application.tasks.conditions.DoIGetBonus;

import java.lang.reflect.Method;

public class DoIGetBonusTest {
    DoIGetBonus doIGetBonus = new DoIGetBonus();
    @Test
    void bonusTimeTest() {
        try {
            Method method = DoIGetBonus.class.getDeclaredMethod("bonusTime", int.class, boolean.class);
            assertEquals("100", method.invoke(doIGetBonus, 10, true), "salary == 10, bonus == true");
            assertEquals("10", method.invoke(doIGetBonus, 10, false), "salary == 10, bonus == false");
            assertEquals("1230", method.invoke(doIGetBonus, 123, true), "salary == 10, bonus == true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
