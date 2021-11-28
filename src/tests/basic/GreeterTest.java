package tests.basic;

import org.junit.Test;
import tasks.basic.Greeter;

import static org.junit.Assert.assertEquals;

public class GreeterTest {


    public class ExampleTest {
        @Test
        public void Test() {
            Greeter greeter = new Greeter();

            assertEquals( "Hello, Jim!", greeter.greet("Jim"));
            assertEquals("Hello, Jane!", greeter.greet("Jane"));
            assertEquals("Hello, Simon!", Greeter.greet("Simon"));
            assertEquals("Hello,  !", Greeter.greet(" "));
            assertEquals("Hello, my love!", Greeter.greet("Johnny"));
        }

    }

}
