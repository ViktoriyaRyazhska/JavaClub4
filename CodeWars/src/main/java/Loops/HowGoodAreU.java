package Loops;

public class HowGoodAreU {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;

        for (int num : classPoints) {
            sum += num;
        }
        int res = sum / classPoints.length;
        if (res > yourPoints) {
            return false;
        } else {
            return true;
        }
    }
}

