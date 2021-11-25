package loops;


public class Loops_Task_14 {

    public static long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;

            }
        }
        System.out.println(last);

        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        System.out.println(i);
        return true;
    }

    public static void solveTask() {
        System.out.println("This method should return the first pair of two prime numbers spaced with a \n" +
                "gap of g between the limits m, n if these numbers exist otherwise null ");
        gap(2, 100, 110);
    }

}

