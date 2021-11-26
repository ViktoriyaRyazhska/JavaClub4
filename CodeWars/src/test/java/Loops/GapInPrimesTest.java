package Loops;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GapInPrimesTest {
    @Test
    public void test(){
        Assert.assertEquals("[59, 61]", Arrays.toString(GapInPrimes.gap(2,50,90)));
        Assert.assertEquals("[67, 71]", Arrays.toString(GapInPrimes.gap(4,50,90)));
        Assert.assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8,320,456)));
        Assert.assertEquals("[1021, 1031]", Arrays.toString(GapInPrimes.gap(10,1000,2000)));

    }

}
