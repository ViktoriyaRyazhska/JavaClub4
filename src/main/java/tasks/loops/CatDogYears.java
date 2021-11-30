package tasks.loops;

import java.util.Arrays;

public class CatDogYears {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int dogYears = 0;
        int catYears = 0;

        if (humanYears == 1) {
            dogYears = 15;
            catYears = 15;
            return new int[]{humanYears, catYears, dogYears};
        } else if (humanYears == 2) {
            dogYears = 24;
            catYears = 24;
            return new int[]{humanYears, catYears, dogYears};
        } else if (humanYears > 2) {
            dogYears = 24;
            catYears = 24;
            for (int i = 2; i < humanYears; i++) {
                dogYears += 5;
                catYears += 4;
            }
        }
        return new int[]{humanYears, catYears, dogYears};
    }

    public void execute(int humanYears){
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(humanYears)));
    }

}
