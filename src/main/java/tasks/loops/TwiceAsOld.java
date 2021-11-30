package tasks.loops;

public class TwiceAsOld {
    public int twiceAsOld(int dadYears, int sonYears) {
        if (dadYears > sonYears * 2) {
            return dadYears - 2 * sonYears;
        } else if (dadYears < sonYears * 2)
            return 2 * sonYears - dadYears;
        else return 0;
    }

    public void execute(int dadYears, int sonYears) {
        System.out.println(twiceAsOld(dadYears, sonYears));
    }
}