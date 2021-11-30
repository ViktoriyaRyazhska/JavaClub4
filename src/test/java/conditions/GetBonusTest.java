package conditions;

import org.junit.Test;
import tasks.conditions.GetBonus;

import static org.junit.Assert.assertEquals;

public class GetBonusTest {

    @Test
    public void getBonusTest() {

        boolean wellConfigured = unicodeTest();
        assertEquals((wellConfigured ? "£" : "\u00A3") + "100000", GetBonus.bonusTime(10000, true));
        assertEquals((wellConfigured ? "£" : "\u00A3") + "250000", GetBonus.bonusTime(25000, true));
        assertEquals((wellConfigured ? "£" : "\u00A3") + "10000", GetBonus.bonusTime(10000, false));
        assertEquals((wellConfigured ? "£" : "\u00A3") + "60000", GetBonus.bonusTime(60000, false));
        assertEquals((wellConfigured ? "£" : "\u00A3") + "20", GetBonus.bonusTime(2, true));
        assertEquals((wellConfigured ? "£" : "\u00A3") + "78", GetBonus.bonusTime(78, false));
        assertEquals((wellConfigured ? "£" : "\u00A3") + "678900", GetBonus.bonusTime(67890, true));
    }


    public boolean unicodeTest() {
        System.out.println("\u00A3 == £:" + "\u00A3".equalsIgnoreCase("£"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("£");
    }

}
