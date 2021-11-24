package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class TransportationVacationTest {
    @Test
    public void test(){
        Assert.assertEquals(80,TransportationVacation.rentalCarCost(2));
        Assert.assertEquals(140,TransportationVacation.rentalCarCost(4));
        Assert.assertEquals(230,TransportationVacation.rentalCarCost(7));
    }
}
