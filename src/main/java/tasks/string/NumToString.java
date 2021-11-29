package tasks.string;

public class NumToString {

    private static String numberToString(int num) {

        return String.valueOf(num);
    }

    public void execute(int num) {
        System.out.println(numberToString(num));
    }
}
