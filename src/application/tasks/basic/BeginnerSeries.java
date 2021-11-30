package application.tasks.basic;

import java.util.Scanner;

    public class BeginnerSeries {
        public static void task(Scanner in) {

            System.out.println("Enter hours: ");
            int hours = in.nextInt();
            int hoursInMili = hour(hours);
            System.out.println("Enter minutes: ");
            int minute = in.nextInt();
            int minutesInMili = minute(minute);
            System.out.println("Enter seconds: ");
            int seconds = in.nextInt();
            int secondsInMili = second(seconds);
            add(hoursInMili,minutesInMili,secondsInMili);
        }
        public static void add(int hours, int minutes, int seconds){
            System.out.println(hours + minutes + seconds);
        }
        public static int hour(int h){
            while ((h < 0 || h > 23)) {
                System.out.println("Enter hour again");
                BeginnerSeries.hour(h);
            }
            h *= 3_600_000;
            return h;
        }
        public  static int minute(int m) {
            while (m < 0 ||  m >= 60) {
                System.out.println("Enter minute again");
                BeginnerSeries.minute(m);
            }
            m *= 60000;
            return m;
        }
        public static int second(int s){
            while (s < 0 ||  s >= 60) {
                System.out.println("Enter minute again");
                BeginnerSeries.second(s);
            }
            s *= 1000;
            return s;
        }
    }





