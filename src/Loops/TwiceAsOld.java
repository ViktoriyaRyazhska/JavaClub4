package Loops;

public class TwiceAsOld{

    public static int twiceAsOld(int dadYears, int sonYears) {
        if (dadYears > sonYears * 2) {
            return dadYears - (sonYears * 2);
        } else {
            return (sonYears * 2) - dadYears;
        }
    }


}