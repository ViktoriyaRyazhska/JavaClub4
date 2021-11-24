package Classes;

import org.junit.Assert;
import org.junit.Test;

public class TwoFightersTest {
    @Test
    public void test(){
        Assert.assertEquals("Maxim",TwoFighters.declareWinner(new TwoFighters.Fighter(10,"Maxim",15),new TwoFighters.Fighter(15,"Kostya",10),"Maxim"));
        Assert.assertEquals("Kostya",TwoFighters.declareWinner(new TwoFighters.Fighter(40,"Maxim",2),new TwoFighters.Fighter(50,"Kostya",10),"Kostya"));
    }
}
