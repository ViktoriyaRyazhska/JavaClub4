package loops;

public class Maps {
    public static int[] map(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                result[index++] = arr[i] + 1;
            } else {
                result[index++] = arr[i] * 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = {1, 2, 3};
        map(result);
    }
}
