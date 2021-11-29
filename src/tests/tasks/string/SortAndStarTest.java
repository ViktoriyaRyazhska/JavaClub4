package tests.tasks.string;

import application.tasks.string.SortAndStar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAndStarTest {
    SortAndStar sortAndStar = new SortAndStar();
    @Test
    void twoSort() {
        String result1 = "h***e***l***l***o";
        String[] array1 = {"hello", "world"};
        String[] array2 = {"a", "world"};
        assertEquals(result1, sortAndStar.getTwoSort(array1), "hello world");
        assertEquals("a", sortAndStar.getTwoSort(array2), "a world");
    }
}