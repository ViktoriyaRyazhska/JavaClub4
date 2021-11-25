package loops;

public class Loops_Task_2 {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 15;
        int dogYears = 15;
        if(humanYears == 2) {
            return new int[] {humanYears,catYears + 9,dogYears + 9};
        }
        if(humanYears > 2) {
            for (int i = 0; i < humanYears -2; i++) {
                catYears += 4;
                dogYears += 5;
            }
            return new int[] {humanYears,catYears + 9,dogYears + 9};
        }
        return new int[]{humanYears,catYears,dogYears};
    }
}
