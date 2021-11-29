package test_string;


import string.String_Task_15;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class Test_String_Task_15 {


    void twoSort() {
        assertEquals("b***i***t***c***o***i***n", String_Task_15.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", String_Task_15.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
        assertNotEquals("p***e**en", String_Task_15.twoSort(new String[] {"mom", "pen", "random", "coin", "cases", "bird", "easier", "than", "writing", "out", "basic", "ones"}));
        assertNotEquals("do***g", String_Task_15.twoSort(new String[] {"cat", "dog", "house", "test", "tree", "are", "hard", "than", "actor", "out", "basic", "ones"}));
    }
}