package classes;

import org.junit.Assert;
import org.junit.Test;
import tasks.classes.Fighter;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    @Test
    public void fighterTest(){
        assertEquals("Alex", Fighter.declareWinner(
                new Fighter("Alex", 10, 2),
                new Fighter("Harry", 5, 4),
                "Alex"));
        assertEquals("Harry", Fighter.declareWinner(
                new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4),
                "Harry"));
        assertEquals("Harald", Fighter.declareWinner(
                new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4),
                "Harry"));
        assertEquals("Harald", Fighter.declareWinner(
                new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4),
                "Harald"));
        assertEquals("Harald", Fighter.declareWinner(
                new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5),
                "Jerry"));
        assertEquals("Harald", Fighter.declareWinner(
                new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5),
                "Harald"));
        
    }

}
