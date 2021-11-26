package Loops;

import org.junit.Assert;
import org.junit.Test;

public class FindNearestSquareTest {
    @Test
    public void test(){
        Assert.assertEquals(4,FindNearestSquare.nearestSq(6));
        Assert.assertEquals(900,FindNearestSquare.nearestSq(898));
        Assert.assertEquals(36,FindNearestSquare.nearestSq(34));
    }
}
