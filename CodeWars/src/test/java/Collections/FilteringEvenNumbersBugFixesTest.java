package Collections;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


class FilteringEvenNumbersBugFixesTest {
    @Test
    public void test() {
        assertEquals(new ArrayList<Integer>(List.of(1, 3, 5)),
                FilteringEvenNumbersBugFixes.filterOddNumber(new ArrayList<Integer>(List.of(1, 2, 3, 4, 5))));
    }
}