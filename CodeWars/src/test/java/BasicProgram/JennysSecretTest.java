package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class JennysSecretTest {
    @Test
    public void Test(){
        Assert.assertEquals("greetings for other people","Hello,Yra!",JennysSecret.greet("Yra"));
        Assert.assertEquals("greetings for other people","Hello,James!",JennysSecret.greet("James"));
        Assert.assertEquals("greetings for Johnny","Hello, my love!",JennysSecret.greet("Johnny"));
    }
}
