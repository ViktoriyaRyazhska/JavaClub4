package tasks.basic;

public class DoubleInteger {

    public void execute(int num) {
        System.out.println(doubleInteger(num));
    }

    private static int doubleInteger(int i) {
        return i * 2;
    }
}
