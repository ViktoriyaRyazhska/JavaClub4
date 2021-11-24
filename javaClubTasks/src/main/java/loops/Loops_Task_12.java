package loops;

public class Loops_Task_12 {

    public static int nearestSq(int n) {
        int base = (int) Math.round(Math.sqrt(n));
        return base * base;
    }

    public static void main(String args[]) {

        System.out.println(nearestSq(9999));

    }
}
