package JUnitTests.Classes;

import Tasks.Classes.FractionClass.FractionClassImpl;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestFractionClass {
    FractionClassImpl fractionClass1 = new FractionClassImpl(2, 0.0, true);
    FractionClassImpl fractionClass2 = new FractionClassImpl(3, 0.5, true);

    @Test
    public void testFractionClass() {
        assertThat(fractionClass1.add(fractionClass2).toDouble(), is(5.5));
        assertThat(fractionClass1.differ(fractionClass2).toDouble(), is(-1.5));
        assertThat(fractionClass1.multi(fractionClass2).toDouble(), is(7.0));
        assertThat(fractionClass1.divide(fractionClass2).toDouble(), is(0.5714285714285714));

    }
}
