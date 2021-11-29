package Loops;

public class MeanOfAnArray {
    public static int getAverage(int[] marks){
        double average = 0;
        for (int s: marks){
            average += s;
        }
        double result = Math.ceil(average / marks.length);
        return (int) result ;
    }
}
