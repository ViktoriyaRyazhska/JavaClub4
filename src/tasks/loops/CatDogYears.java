package tasks.loops;

import java.util.Arrays;

public class CatDogYears {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int dogYears = 0;
        int catYears = 0;

        for (int i = 0; i < humanYears; i++) {

            System.out.println(i);

            if (humanYears == 1) {
                System.out.println("case1");
                dogYears = dogYears + 15;
                catYears = catYears + 15;
            } else if (humanYears == 2) {
                System.out.println("case2");
                dogYears = dogYears + 9;
                catYears = catYears + 9;
            } else if (humanYears == 3) {
                System.out.println("case3");
                dogYears = dogYears + 5;
                catYears = catYears + 4;
            } else
                dogYears += 5;
                catYears += 4;


        }
        return new int[]{humanYears, catYears, dogYears};
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));
    }
}
