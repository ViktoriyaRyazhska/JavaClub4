package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class CenturyFromYearTest {
    @Test
    public void test(){
        Assert.assertEquals(21,CenturyFromYear.century(2021));
        Assert.assertEquals(1,CenturyFromYear.century(12));
    }
}
