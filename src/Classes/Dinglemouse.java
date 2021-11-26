package Classes;

public class Dinglemouse {

    private static int ONE_HUNDRED = 100;

    private final int value;

    public static final Dinglemouse INST = new Dinglemouse();

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}



