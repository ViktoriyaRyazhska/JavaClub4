package Loops;

public class CatYearsDog {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears =15;
        int dogYears =15;
        if(humanYears >= 2){
            dogYears +=9;
            catYears +=9;
            for(int i = 2 ; i < humanYears;i++){
                catYears +=4;
                dogYears +=5;
            }
        }
        return new int[]{humanYears,catYears,dogYears};
    }
}

