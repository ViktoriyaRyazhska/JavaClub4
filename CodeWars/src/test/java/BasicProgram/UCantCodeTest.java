package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class UCantCodeTest {
   @Test
   public final void testAll(){
      Assert.assertEquals("Nope", 10 , UCantCode.doubleInterger(5));
      Assert.assertEquals("Nope", -8 , UCantCode.doubleInterger(-4));
   }
}
