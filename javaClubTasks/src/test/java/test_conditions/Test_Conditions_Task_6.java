package test_conditions;
import conditions.Conditions_task_6;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Conditions_Task_6 {
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Conditions_task_6.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Conditions_task_6.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Conditions_task_6.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Conditions_task_6.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Conditions_task_6.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Conditions_task_6.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Conditions_task_6.rps("scissors", "scissors"));
        assertEquals("Draw!", Conditions_task_6.rps("paper", "paper"));
        assertEquals("Draw!", Conditions_task_6.rps("rock", "rock"));
    }
}
