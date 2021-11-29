package test_string;

import org.junit.Test;
import string.String_Task_7;

import static org.junit.Assert.assertEquals;

public class Test_String_Task_7 {

    @Test
    public void noSpace() {
        assertEquals("8j8mBliB8gimjB8B8jlB", String_Task_7.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", String_Task_7.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", String_Task_7.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", String_Task_7.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", String_Task_7.noSpace("8j aam"));
    }
}