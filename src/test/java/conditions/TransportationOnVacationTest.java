package conditions;

import org.junit.Test;
import tasks.conditions.TransportationOnVacation;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TransportationOnVacationTest {
    @Test
    public void basicTests() {
        String msg = "Should work for under 3 days";
        System.out.println(msg+"...\n");
        assertEquals(msg, 40, TransportationOnVacation.rentalCarCost(1));
        assertEquals(msg, 80, TransportationOnVacation.rentalCarCost(2));
        msg = msg.replace("3", "7");
        System.out.println(msg+"...\n");
        assertEquals(msg, 100, TransportationOnVacation.rentalCarCost(3));
        assertEquals(msg, 140, TransportationOnVacation.rentalCarCost(4));
        assertEquals(msg, 180, TransportationOnVacation.rentalCarCost(5));
        assertEquals(msg, 220, TransportationOnVacation.rentalCarCost(6));
        msg = msg.replace("under", "over");
        System.out.println(msg+"...\n");
        assertEquals(msg, 230, TransportationOnVacation.rentalCarCost(7));
        assertEquals(msg, 270, TransportationOnVacation.rentalCarCost(8));
        assertEquals(msg, 310, TransportationOnVacation.rentalCarCost(9));
        assertEquals(msg, 350, TransportationOnVacation.rentalCarCost(10));
    }

    @Test
    public void randomTests() {
        Random randGen = new Random();
        System.out.println("Testing 100 random days...");
        for (int i = 0; i < 100; i++) {
            int days = randGen.nextInt(101);
            assertEquals("Should work for " + days +
                    " days", solution(days),
                    TransportationOnVacation.rentalCarCost(days));
        }
    }

    private int solution(int d) {
        if (d<3) return d*40;
        return (d<7) ? d*40-20 : d*40-50;
    }
}
