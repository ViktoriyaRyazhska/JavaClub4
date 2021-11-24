package basic_program;

public class Task_8 {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        int result = wallLength % pixelSize;

        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(2045, 5));

    }
}
