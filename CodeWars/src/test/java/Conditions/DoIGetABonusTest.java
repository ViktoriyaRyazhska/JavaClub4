package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class DoIGetABonusTest {
    @Test
    public void test(){
        Assert.assertEquals("\u00A3"+"150000",DoIGetABonus.bonusTime(15000,true));
        Assert.assertEquals("\u00A3"+"195000",DoIGetABonus.bonusTime(19500,true));
        Assert.assertEquals("\u00A3"+"10000",DoIGetABonus.bonusTime(10000,false));
    }
}
