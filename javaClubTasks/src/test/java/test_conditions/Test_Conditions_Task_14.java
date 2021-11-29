package test_conditions;
import conditions.Conditions_task_14;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_Conditions_Task_14 {
    @Test
    public void under3Tests() {
        assertEquals(40, Conditions_task_14.rentalCarCost(1));
        assertEquals(80, Conditions_task_14.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, Conditions_task_14.rentalCarCost(3));
        assertEquals(140, Conditions_task_14.rentalCarCost(4));
        assertEquals(180, Conditions_task_14.rentalCarCost(5));
        assertEquals(220, Conditions_task_14.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, Conditions_task_14.rentalCarCost(7));
        assertEquals(270, Conditions_task_14.rentalCarCost(8));
        assertEquals(310, Conditions_task_14.rentalCarCost(9));
        assertEquals(350, Conditions_task_14.rentalCarCost(10));
    }


    // Unxpected Result
    @Test
    public void over7TestsUnxpectedResult() {
        assertNotEquals(32, Conditions_task_14.rentalCarCost(7));
        assertNotEquals(75, Conditions_task_14.rentalCarCost(8));
        assertNotEquals(17, Conditions_task_14.rentalCarCost(9));
        assertNotEquals(94, Conditions_task_14.rentalCarCost(10));
    }
}
