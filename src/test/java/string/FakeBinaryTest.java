package string;

import org.junit.Test;
import tasks.string.FakeBinary;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FakeBinaryTest {
    @Test
    public void testSomething() {
//        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary.fakeBin("366058562030849490134388085"));
    }

    @Test
    public void randomTests(){
//        FakeBinary fakeBinary = new FakeBinary();

        String chars = "0123456789";
        Random random = new Random();

        for(int i = 0; i < 100; i++){
            String s = IntStream.range(1, random.nextInt(100))
                    .mapToObj(x->Character.toString(chars.charAt(random.nextInt(chars.length()))))
                    .collect(Collectors.joining());
            String sol = s.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1");
            assertEquals(sol, FakeBinary.fakeBin(s));
        }
    }
}
