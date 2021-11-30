package string;

import org.junit.Test;
import tasks.string.ExclamationMarks;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ExclamationMarksTest {
    @Test
    public void fixedTests() {
        assertEquals("Hi", ExclamationMarks.remove("Hi!", 1));
        assertEquals("Hi", ExclamationMarks.remove("Hi!", 100));
        assertEquals("Hi!!", ExclamationMarks.remove("Hi!!!", 1));
        assertEquals("Hi", ExclamationMarks.remove("Hi!!!", 100));
        assertEquals("Hi", ExclamationMarks.remove("!Hi", 1));
        assertEquals("Hi!", ExclamationMarks.remove("!Hi!", 1));
        assertEquals("Hi", ExclamationMarks.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", ExclamationMarks.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", ExclamationMarks.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", ExclamationMarks.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", ExclamationMarks.remove("!!!Hi !!hi!!! !hi", 100));
    }

    private static String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";

    @Test
    public void RandomTest(){
        Random r = new Random();
        String s = "";
        for (int i = 0; i < 100; i++){
            s = "";
            int length = r.nextInt(100);
            for(int j = 0; j<length;j++){
                s+= chars.charAt(r.nextInt(117))+"";
            }
            int amount = r.nextInt(20);
            assertEquals(remove(s,amount), ExclamationMarks.remove(s, amount));
        }
    }

    public static String remove(String s, int n){

        for(int i = 0; i<n;i++)
            s = s.replaceFirst("!","");

        return s;
    }
}
