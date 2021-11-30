package Loops;

public class MeanOfAnArray {
    public static int getAverage(int[] marks){
        int average = 0;
        for (int s: marks){
            average += s;
        }
        return average / marks.length;
    }
}
