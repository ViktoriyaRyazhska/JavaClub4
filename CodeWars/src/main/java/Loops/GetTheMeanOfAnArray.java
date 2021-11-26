package Loops;

public class GetTheMeanOfAnArray {
    public static int getAverage(int[] marks){
        int sum = 0;
        for (int num : marks) {
            sum += num;
        }
        return sum / marks.length;
    }
}

