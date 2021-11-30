package string;

import org.junit.Test;
import tasks.string.CharProblem;

import static org.junit.Assert.assertEquals;

public class CharProblemTest {
    @Test
    public void test() {
        assertEquals(1, CharProblem.howOld("1 year old"));
        assertEquals(2, CharProblem.howOld("2 years old"));
        assertEquals(3, CharProblem.howOld("3 years old"));
        assertEquals(4, CharProblem.howOld("4 years old"));
        assertEquals(5, CharProblem.howOld("5 years old"));
        assertEquals(6, CharProblem.howOld("6 years old"));
        assertEquals(7, CharProblem.howOld("7 years old"));
        assertEquals(8, CharProblem.howOld("8 years old"));
        assertEquals(9, CharProblem.howOld("9 years old"));
    }
}
