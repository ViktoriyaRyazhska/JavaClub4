package Classes;

import org.junit.Assert;
import org.junit.Test;

public class LombokTest {
    @Test
    public void test(){
        Lombok lom = new Lombok();
        Assert.assertEquals(0,lom.getNumber());
    }
}
