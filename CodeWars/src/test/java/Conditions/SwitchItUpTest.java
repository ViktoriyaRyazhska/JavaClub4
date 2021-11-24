package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class SwitchItUpTest {
    @Test
    public void test(){
        Assert.assertEquals("One",SwitchItUp.switchItUp(1));
        Assert.assertEquals("Zero",SwitchItUp.switchItUp(0));
        Assert.assertEquals("Nine",SwitchItUp.switchItUp(9));
    }
}
