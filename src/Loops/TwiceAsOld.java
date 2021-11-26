package JavaClub4.src.Loops;

public class TwiceAsOld{

    public static int TwiceAsOld(int dadYears, int sonYears) {
        if (dadYears > sonYears * 2) {
            return dadYears - (sonYears * 2);
        } else {
            return (sonYears * 2) - dadYears;
        }
    }


}