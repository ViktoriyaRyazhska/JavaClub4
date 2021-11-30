package test.OOPTest;
import OOP.God;
import OOP.Human;
import OOP.Man;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GodTest {
    @Test
    public void makingAdam(){
        Human[] paradise = God.create();
        assertEquals(true ,paradise[0] instanceof Man);
    }
}
