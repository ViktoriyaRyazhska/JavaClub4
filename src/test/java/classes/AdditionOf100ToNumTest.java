package test.java.classes;

import org.junit.Assert;
import org.junit.Test;
import tasks.classes.AdditionOf100ToNum;

public class AdditionOf100ToNumTest {

    @Test
    public void additionOf100ToNumTest(){
        Assert.assertEquals(123, AdditionOf100ToNum.INST.plus100(23));
        Assert.assertEquals(111, AdditionOf100ToNum.INST.plus100(11));
        Assert.assertEquals(200, AdditionOf100ToNum.INST.plus100(100));
        Assert.assertNotEquals(111, AdditionOf100ToNum.INST.plus100(20));
        Assert.assertNotEquals(122, AdditionOf100ToNum.INST.plus100(40));
        Assert.assertNotEquals(123, AdditionOf100ToNum.INST.plus100(60));
    }
}
