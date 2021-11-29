package BasicProgram;

import org.junit.Assert;
import org.junit.Test;

public class UCantCodeTest {
   @Test
   public final void testAll(){
      Assert.assertEquals("Nope", 10 , UCantCode.doubleInteger(5));
      Assert.assertEquals("Nope", -8 , UCantCode.doubleInteger(-4));
   }
}
