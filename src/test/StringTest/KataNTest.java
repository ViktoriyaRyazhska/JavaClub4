package test.StringTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import String.KataN;

public class KataNTest {
    @Test public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", KataN.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", KataN.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", KataN.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", KataN.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", KataN.noSpace("8j aam"));
    }
}