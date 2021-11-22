package Classes;

public class FixmeStaticElectrickery {
    public static final FixmeStaticElectrickery INST = new FixmeStaticElectrickery();

    private  int ONE_HUNDRED = 100;

    private static int value;

    public FixmeStaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public void execute(int n) {
        System.out.println(FixmeStaticElectrickery.INST.plus100(n));
    }
}
