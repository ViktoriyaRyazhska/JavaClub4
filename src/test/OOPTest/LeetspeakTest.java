package test.OOPTest;

import OOP.Leetspeak;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetspeakTest {

    private Leetspeak myEncoder;

    @Before
    public void setUp(){
        myEncoder = new Leetspeak();
    }

    @Test
    public void encodeEmpty() {
        assertTrue("empty string", myEncoder.encode("").equals(""));
    }

    @Test
    public void encode() {
        assertTrue("empty string", myEncoder.encode("abcdef").equals("4bcd3f"));
    }

    @Test
    public void encodeAllCipherChars() {
        assertTrue("empty string", myEncoder.encode("aelmou").equals("431/^^\\0(_)"));
    }
}