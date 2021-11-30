package oop;

import org.junit.Test;
import tasks.oop.AdamAndEve.*;
import tasks.oop.adamAndEve.God;
import tasks.oop.adamAndEve.Human;
import tasks.oop.adamAndEve.Man;


import static org.junit.Assert.assertEquals;

public class AdamAndEveTest {

    @Test
    public void adamAndEveTest(){
        Human[] paradise = God.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
}
