package Tasks.Classes.FixStaticElectrickery;

public class FixStaticElectrickeryImpl {
    private int ONE_HUNDRED = 100;

    private static int value;

    public FixStaticElectrickeryImpl() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
