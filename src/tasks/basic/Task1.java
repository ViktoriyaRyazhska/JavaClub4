package tasks.basic;

public class Task1 {

    public void execute(int num) {
        System.out.println(doubleInteger(num));
    }

    private static int doubleInteger(int i) {
        return i * 2;
    }
}
