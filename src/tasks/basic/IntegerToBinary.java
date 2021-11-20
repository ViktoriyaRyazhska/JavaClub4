package ackage tasks;

public class IntegerToBinary{

    public void execute(int i) {
        System.out.println(toBinary(i));
    }
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}

