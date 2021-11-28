package test_string;
import org.junit.Test;
import string.String_Task_6;
import static org.junit.Assert.assertEquals;

public class Test_String_Task_6 {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", String_Task_6.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", String_Task_6.areYouPlayingBanjo("Rikke"));
    }
}
