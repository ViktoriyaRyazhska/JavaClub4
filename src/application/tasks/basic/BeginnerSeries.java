package application.tasks.basic;

import java.util.Scanner;

    public class BeginnerSeries {
        public static void task(Scanner in) {

            System.out.println("Enter hours: ");
            int hours = in.nextInt();
            int hoursInMili = hour(hours,in);
            System.out.println("Enter minutes: ");
            int minute = in.nextInt();
            int minutesInMili = minute(minute,in);
            System.out.println("Enter seconds: ");
            int seconds = in.nextInt();
            int secondsInMili = second(seconds,in);
            add(hoursInMili,minutesInMili,secondsInMili);
        }
        public static void add(int hours, int minutes, int seconds){
            System.out.println(hours + minutes + seconds);
        }
        public static int hour(int h,Scanner in){
            while ((h < 0 || h > 23)) {
                System.out.println("Enter hour again");
                BeginnerSeries.task(in);
            }
            h *= 3_600_000;
            return h;
        }
        public  static int minute(int m,Scanner in) {
            while (m < 0 ||  m >= 60) {
                System.out.println("Enter minute again");
                BeginnerSeries.task(in);
            }
            m *= 60000;
            return m;
        }
        public static int second(int s,Scanner in){
            while (s < 0 ||  s >= 60) {
                System.out.println("Enter minute again");
                BeginnerSeries.task(in);
            }
            s *= 1000;
            return s;
        }
    }





