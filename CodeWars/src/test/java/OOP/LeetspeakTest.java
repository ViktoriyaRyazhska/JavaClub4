package OOP;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

class LeetspeakTest {
    Leetspeak myEncoder = new Leetspeak();

    @Test
    public void simpleTest(){
        assertTrue(myEncoder.encode("").equals(""));
        assertTrue(myEncoder.encode("abcdef").equals("4bcd3f"));
    }

}