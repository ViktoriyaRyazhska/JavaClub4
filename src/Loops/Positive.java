public class Positive {
    public static int sum(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0)
            result += arr[i];
        }
        return result;
    }
}
