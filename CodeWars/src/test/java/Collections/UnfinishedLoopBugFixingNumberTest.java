package Collections;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


class UnfinishedLoopBugFixingNumberTest {
    @Test
    public void test() {

        List list1 = UnfinishedLoopBugFixingNumber.CreateList(4);
        List list2 = UnfinishedLoopBugFixingNumber.CreateList(5);
        assertEquals(List.of(1, 2, 3, 4), list1);
        assertEquals(List.of(1, 2, 3, 4, 5), list2);
    }

}