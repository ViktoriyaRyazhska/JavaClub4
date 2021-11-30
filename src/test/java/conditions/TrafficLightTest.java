package conditions;

import org.junit.Test;
import tasks.conditions.TrafficLight;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TrafficLightTest {
    String input;
    String expected;

    @Test
    public void testUpdateLight(){
        assertEquals("green", TrafficLight.updateLight("red"));
        assertEquals("yellow", TrafficLight.updateLight("green"));
        assertEquals("red", TrafficLight.updateLight("yellow"));
    }

    @Test
    public void testRandomUpdateLight() {
        Random rand = new Random();

        for (int i=0; i < 10; i++) {
            int index = rand.nextInt(3);
            switch (index) {
                case 0:
                    input = "green";
                    expected = "yellow";
                    break;
                case 1:
                    input = "yellow";
                    expected = "red";
                    break;
                case 2:
                    input = "red";
                    expected = "green";
                    break;
            }
            assertEquals(expected, TrafficLight.updateLight(input));
        }
    }
}
