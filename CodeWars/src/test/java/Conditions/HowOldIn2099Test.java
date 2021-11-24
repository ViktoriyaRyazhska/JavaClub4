package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class HowOldIn2099Test {
    @Test
    public void test(){
        Assert.assertEquals("You are 1 year old.",HowOldIn2099.CalculateAge(2098,2099));
        Assert.assertEquals("You are " + 17 + " years old.",HowOldIn2099.CalculateAge(1000,1017));
        Assert.assertEquals("You will be born in " + 17 + " years.",HowOldIn2099.CalculateAge(2017,2000));
        Assert.assertEquals("You were born this very year!",HowOldIn2099.CalculateAge(2098,2098));
        Assert.assertEquals("You will be born in 1 year.",HowOldIn2099.CalculateAge(2099,2098));
    }
}
