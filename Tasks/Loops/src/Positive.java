public class Positive {

    public static int sum(int[] arr) {
        int sumOfPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumOfPositive += arr[i];
            }
        }
        if (sumOfPositive > 0) {
            return sumOfPositive;
        }
        return 0;
    }

}