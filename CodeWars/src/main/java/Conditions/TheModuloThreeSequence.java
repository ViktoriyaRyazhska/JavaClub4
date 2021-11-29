package Conditions;

public class TheModuloThreeSequence {
    public static int sequence(int n) {
        int remainder = n % 8;
        int res = 0;
        switch (remainder) {
            case 1:
            case 5:
                res = 0;
                break;
            case 2:
            case 3:
            case 8:
            case 0:
                res = 1;
                break;
            case 4:
            case 6:
            case 7:
                res = 2;
                break;
            default:
                throw new IllegalArgumentException("Argument out of range");
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(298 % 8);
    }
}

