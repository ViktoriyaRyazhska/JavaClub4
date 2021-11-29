package application.tasks.classes;

public class FixMe {
    public static final FixMe INST = new FixMe();

    private static int ONE_HUNDRED = 100;

    private int value; // removed 'static'

    public FixMe() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void task() {
        System.out.println("Done");
    }
}
