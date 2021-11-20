package application.tasks.basic;
import java.util.Scanner;

    public class BeginnerSeries {
        public static void task() {
            int result;
            Scanner h = new Scanner(System.in);
            System.out.println("Enter hour");
            int hour;
            while ((hour = h.nextInt()) < 0 || hour > 23) {
                System.out.println("Enter hour again");
            }
            hour *= 3_600_000;
            Scanner m = new Scanner(System.in);
            System.out.println("Enter minute");
            int minute;
            while ((minute = m.nextInt()) < 0 || minute >= 60) {
                System.out.println("Enter minute again");
            }
            minute *= 60000;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter second");
            int second;
            while ((second = s.nextInt()) < 0 || second >60) {
                System.out.println("Enter second again");
            }
            second *= 1000;
            result = (hour+minute+second);
            System.out.println("Milliseconds: " + result);
        }
    }

