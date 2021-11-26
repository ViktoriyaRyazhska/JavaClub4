package test_string;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import string.String_Task_16;

public class Test_String_Task_16 {

    @Test
    public void testSomething() {
        assertEquals("IF-RUDYARD KIPLING", String_Task_16.correct(String_Task_16.correct("1F-RUDYARD K1PL1NG")));
        assertEquals("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS", String_Task_16.correct(String_Task_16.correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5")));
        assertEquals("RICHARD P. FEYNMAN - STATISTICAL MECHANICS", String_Task_16.correct(String_Task_16.correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5")));
        assertEquals("STEPHEN HAWKING - A BRIEF HISTORY OF TIME", String_Task_16.correct(String_Task_16.correct("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME")));

    }
}
