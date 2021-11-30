package loops;

import org.junit.Test;
import tasks.loops.CatDogYears;

import static org.junit.Assert.assertArrayEquals;

public class CatDogYearsTest {

    @Test
    public void catDogYearsTest() {
        assertArrayEquals(new int[]{1,15,15}, CatDogYears.humanYearsCatYearsDogYears(1));
        assertArrayEquals(new int[]{2,24,24}, CatDogYears.humanYearsCatYearsDogYears(2));
        assertArrayEquals(new int[]{10,56,64}, CatDogYears.humanYearsCatYearsDogYears(10));
    }
}
