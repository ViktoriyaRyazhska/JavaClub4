package Loops;

class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        int size = (int) n - (int) m;
        long[] l = new long[size];
        int k = 0;
        while (m <= n) {
            boolean flag = false;
            for (long i = 2; i > m / 2; i++) {
                if (m % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                l[k] = m;
                //System.out.println(m);
                k++;
            }
            m++;
        }
        long[] res = new long[2];
        for (int p = 0; p < k; p++) {
            if (l[p + 1] - l[p] == g) {
                res[0] = l[p];
                res[1] = l[p + 1];
                return res;
            }
        }
        return null;
    }
}