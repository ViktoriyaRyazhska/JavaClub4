package test.ConditionsTest;

import Conditions.RentalCarCost;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalCostCarTest {

    @Test
    public void RentalCarFirst() {
        int expected = 230;
        int result = RentalCarCost.rentalCarCost(7);
        assertEquals(expected,result);
    }

    @Test
    public void RentalCarSecond() {
        int expected = 180;
        int result = RentalCarCost.rentalCarCost(5);
        assertEquals(expected,result);
    }

    @Test
    public void RentalCarThird() {
        int expected = 80;
        int result = RentalCarCost.rentalCarCost(2);
        assertEquals(expected,result);
    }
}