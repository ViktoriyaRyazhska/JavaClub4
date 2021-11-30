package classes;

import org.junit.Assert;
import org.junit.Test;
import tasks.classes.Fraction;

public class FractionTest {

    @Test
    public void T1_GeneralTests() {

        Assert.assertEquals(new Fraction(37, 40), new Fraction(1, 8).add(new Fraction(4, 5)));
        Assert.assertEquals(new Fraction(1, 1), new Fraction(1, 4).add(new Fraction(3, 4)));
        Assert.assertEquals(new Fraction(863483, 416760), new Fraction(911, 920).add(new Fraction(980, 906)));
        Assert.assertEquals(new Fraction(838923, 926885), new Fraction(610, 941).add(new Fraction(253, 985)));
        Assert.assertEquals(new Fraction(16880, 3591), new Fraction(956, 798).add(new Fraction(662, 189)));
        Assert.assertEquals(new Fraction(1011239, 417585), new Fraction(694, 485).add(new Fraction(853, 861)));
        Assert.assertEquals(new Fraction(191737, 20757), new Fraction(982, 111).add(new Fraction(219, 561)));
        Assert.assertEquals(new Fraction(41201, 23571), new Fraction(344, 873).add(new Fraction(658, 486)));
        Assert.assertEquals(new Fraction(184563, 68951), new Fraction(662, 361).add(new Fraction(322, 382)));
        Assert.assertEquals(new Fraction(33926, 23577), new Fraction(740, 813).add(new Fraction(184, 348)));
        Assert.assertEquals(new Fraction(78524, 39543), new Fraction(579, 441).add(new Fraction(543, 807)));
        Assert.assertEquals(new Fraction(83997, 283910), new Fraction(212, 979).add(new Fraction(46, 580)));

        Assert.assertEquals(new Fraction(1, 2), new Fraction(4, 8));
        Assert.assertEquals(new Fraction(2, 3), new Fraction(10, 15));
        Assert.assertEquals(new Fraction(4, 9), new Fraction(24, 54));

        Assert.assertEquals("4/5", (new Fraction(2, 5).add(new Fraction(2, 5))).toString());
        Assert.assertEquals("5/6", (new Fraction(2, 4).add(new Fraction(1, 3))).toString());
        Assert.assertEquals("13/15", (new Fraction(1, 5).add(new Fraction(4, 6))).toString());
    }

}
