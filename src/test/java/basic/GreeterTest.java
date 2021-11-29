package test.java.basic;

import org.junit.Test;
import tasks.basic.Greeter;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

        @Test
        public void Test() {
            assertEquals( "Hello, Jim!", Greeter.greet("Jim"));
            assertEquals("Hello, Jane!", Greeter.greet("Jane"));
            assertEquals("Hello, Simon!", Greeter.greet("Simon"));
            assertEquals("Hello,  !", Greeter.greet(" "));
            assertEquals("Hello, my love!", Greeter.greet("Johnny"));
        }


}
