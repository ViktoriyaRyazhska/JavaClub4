package string;

import org.junit.Test;
import tasks.string.FindLetterPosition;

import static org.junit.Assert.assertEquals;

public class FindLetterPositionTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", FindLetterPosition.findLetterPosition('a'));
        assertEquals("Position of alphabet: 26", FindLetterPosition.findLetterPosition('z'));
        assertEquals("Position of alphabet: 5", FindLetterPosition.findLetterPosition('e'));
    }

    @Test
    public void randomTests() {
        for(int i=0;i<97;i++)
        {
            String a = "abcdefghijklmnopqrstuvwxyz";
            char b = a.charAt((int)(Math.random()*26));
            System.out.println(b);
            assertEquals("Position of alphabet: " + (b-96), FindLetterPosition.findLetterPosition(b));
        }
    }
}
