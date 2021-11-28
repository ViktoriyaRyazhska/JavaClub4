package tasks.classes;

public class AdditionOf100ToNum {

    private static int ONE_HUNDRED = 100;

    public static final AdditionOf100ToNum INST = new AdditionOf100ToNum();

     private static int value;

    public AdditionOf100ToNum() {

        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public void execute(int n) {
        System.out.println(AdditionOf100ToNum.INST.plus100(n));
    }
}
