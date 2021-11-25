package classes;

public class Classes_Task_6 {
    private static int ONE_HUNDRED = 100;

    public static final Classes_Task_6 INST = new Classes_Task_6();

    private final int value;

    private Classes_Task_6() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
    public static void main(String[] args) {
        System.out.println(Classes_Task_6.INST.plus100(120));
    }
}
