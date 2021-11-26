package Loops;

import org.junit.Assert;
import org.junit.Test;

public class LostWithoutMapTest {
    @Test
    public void test(){
        Assert.assertArrayEquals((new int[]{4,6,8}),LostWithoutMap.map(new int[]{2,3,4}));
        Assert.assertArrayEquals((new int[]{4,6,8,2,2,44,12}),LostWithoutMap.map(new int[]{2,3,4,1,1,22,6}));
    }
}
