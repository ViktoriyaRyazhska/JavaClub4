package Loops;

public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears){
        int x = dadYears - (sonYears*2);
        return x < 0 ? x*-1 : x ;
    }
}

