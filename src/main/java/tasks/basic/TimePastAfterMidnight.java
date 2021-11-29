package tasks.basic;

public class TimePastAfterMidnight {
    public void execute(int h, int m, int s) {

        System.out.println(timePastAfterMidnight(h, m, s));
    }

    public static int timePastAfterMidnight(int h, int m, int s) {

        return h * 3600000 + m * 60000 + s * 1000;
    }
}