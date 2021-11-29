package test_conditions;
import conditions.Conditions_task_4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;

public class Test_Conditions_Task_4 {
    @Test
    public void basicTests() {
        boolean wellConfigured=unicodeTest();
        assertEquals((wellConfigured?"£":"\u00A3")+"100000", Conditions_task_4.bonusTime(10000, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"250000",Conditions_task_4.bonusTime(25000, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"10000",Conditions_task_4.bonusTime(10000, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"60000",Conditions_task_4.bonusTime(60000, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"20",Conditions_task_4.bonusTime(2, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"78",Conditions_task_4.bonusTime(78, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"678900",Conditions_task_4.bonusTime(67890, true));
    }

    public boolean unicodeTest(){
        System.out.println("\u00A3 == £:"+"\u00A3".equalsIgnoreCase("£"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("£");
    }


    // Unxpected Result
    @Test
    public void basicTestsUnxpectedResult() {
        boolean wellConfigured=unicodeTest();

        assertNotEquals((wellConfigured?"£":"\u00A3")+"12",Conditions_task_4.bonusTime(67890, true));
        assertNotEquals((wellConfigured?"£":"\u00A3")+"8888",Conditions_task_4.bonusTime(2, true));
        assertNotEquals((wellConfigured?"£":"\u00A3")+"985",Conditions_task_4.bonusTime(78, false));

    }

}
