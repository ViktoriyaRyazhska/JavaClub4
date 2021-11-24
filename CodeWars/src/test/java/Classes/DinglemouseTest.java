package Classes;

import org.junit.Assert;
import org.junit.Test;

public class DinglemouseTest {
    @Test
    public void test(){
        Assert.assertEquals(253,Dinglemouse.INST.plus100(153));
        Assert.assertEquals(-165,Dinglemouse.INST.plus100(-265));
        Assert.assertEquals(100,Dinglemouse.INST.plus100(0));
    }
}
