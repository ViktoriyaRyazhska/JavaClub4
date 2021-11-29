package tasks.loops;

public class PrimeSequence {

        public static long[] gap(int g, long m, long n) {
            for (long i = m; i <= n; i++) {
                boolean isPair = false;
                boolean hasBetween = false;
                if (isPrime(i)) {
                    if (isPrime(i+g)) {
                        isPair = true;
                    }
                }
                if (isPair) {
                    for (long k = i+1; k < i+g; k++) {
                        if (isPrime(k)) {
                            hasBetween = true;
                            isPair = false;
                            break;
                        }
                    }
                    if (!hasBetween) {
                        return new long[] {i, i+g};
                    }
                }
            }
            return null;
        }
        static boolean isPrime(long num) {
            for (long i = 2; i <= num / 2; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

}
