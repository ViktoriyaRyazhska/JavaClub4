package test_classes;


import classes.Classes_Task_5;
import classes.Classes_Task_5_Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class Test_Classes_Task_5 {
    @Test
    public void basicTests() {
        assertEquals("Lew", Classes_Task_5_Game.declareWinner(new Classes_Task_5("Lew", 10, 2), new Classes_Task_5("Harry", 5, 4), "Lew"));
        assertEquals("Harry", Classes_Task_5_Game.declareWinner(new Classes_Task_5("Lew", 10, 2), new Classes_Task_5("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Classes_Task_5_Game.declareWinner(new Classes_Task_5("Harald", 20, 5), new Classes_Task_5("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Classes_Task_5_Game.declareWinner(new Classes_Task_5("Harald", 20, 5), new Classes_Task_5("Harry", 5, 4), "Harald"));
        assertEquals("Harald", Classes_Task_5_Game.declareWinner(new Classes_Task_5("Jerry", 30, 3), new Classes_Task_5("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", Classes_Task_5_Game.declareWinner(new Classes_Task_5("Jerry", 30, 3), new Classes_Task_5("Harald", 20, 5), "Harald"));
    }
}