package test_classes;
import org.junit.Assert;
import org.junit.Test;
import classes.Classes_Task_3;

public class Test_Classes_Task_3 {

    @Test
    public void add() {
        Assert.assertEquals(new Classes_Task_3(37, 40), new Classes_Task_3(1, 8).add(new Classes_Task_3(4, 5)));
        Assert.assertEquals(new Classes_Task_3(1, 1), new Classes_Task_3(1, 4).add(new Classes_Task_3(3, 4)));
        Assert.assertEquals(new Classes_Task_3(863483, 416760), new Classes_Task_3(911, 920).add(new Classes_Task_3(980, 906)));
        Assert.assertEquals(new Classes_Task_3(838923, 926885), new Classes_Task_3(610, 941).add(new Classes_Task_3(253, 985)));
        Assert.assertEquals(new Classes_Task_3(16880, 3591), new Classes_Task_3(956, 798).add(new Classes_Task_3(662, 189)));
        Assert.assertEquals(new Classes_Task_3(1011239, 417585), new Classes_Task_3(694, 485).add(new Classes_Task_3(853, 861)));
        Assert.assertEquals(new Classes_Task_3(191737, 20757), new Classes_Task_3(982, 111).add(new Classes_Task_3(219, 561)));
        Assert.assertEquals(new Classes_Task_3(41201, 23571), new Classes_Task_3(344, 873).add(new Classes_Task_3(658, 486)));
        Assert.assertEquals(new Classes_Task_3(184563, 68951), new Classes_Task_3(662, 361).add(new Classes_Task_3(322, 382)));
        Assert.assertEquals(new Classes_Task_3(33926, 23577), new Classes_Task_3(740, 813).add(new Classes_Task_3(184, 348)));
        Assert.assertEquals(new Classes_Task_3(78524, 39543), new Classes_Task_3(579, 441).add(new Classes_Task_3(543, 807)));
        Assert.assertEquals(new Classes_Task_3(83997, 283910), new Classes_Task_3(212, 979).add(new Classes_Task_3(46, 580)));
    }

    @Test
    public void testToString() {
        Assert.assertEquals(new Classes_Task_3(1, 2), new Classes_Task_3(4, 8));
        Assert.assertEquals(new Classes_Task_3(2, 3), new Classes_Task_3(10, 15));
        Assert.assertEquals(new Classes_Task_3(4, 9), new Classes_Task_3(24, 54));
    }

    @Test
    public void testEquals() {
        Assert.assertEquals("4/5", (new Classes_Task_3(2, 5).add(new Classes_Task_3(2, 5))).toString());
        Assert.assertEquals("5/6", (new Classes_Task_3(2, 4).add(new Classes_Task_3(1, 3))).toString());
        Assert.assertEquals("13/15", (new Classes_Task_3(1, 5).add(new Classes_Task_3(4, 6))).toString());
    }
}