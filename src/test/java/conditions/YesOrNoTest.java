package conditions;

import org.junit.Test;
import tasks.conditions.YesOrNo;

import static org.junit.Assert.assertEquals;

public class YesOrNoTest {

    @Test
    public void yesOrNoTest() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}
