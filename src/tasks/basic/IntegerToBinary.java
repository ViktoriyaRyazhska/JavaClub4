package tasks.basic;

public class IntegerToBinary{

    public void execute(int i) {
        System.out.println(toBinary(i));
    }
    private static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}

