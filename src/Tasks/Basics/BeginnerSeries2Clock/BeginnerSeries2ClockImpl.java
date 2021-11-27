package Tasks.Basics.BeginnerSeries2Clock;

import java.util.Scanner;

public class BeginnerSeries2ClockImpl implements BegginerSeries2Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public BeginnerSeries2ClockImpl(final Scanner scanner) {
        setHours(scanner.nextInt());
        setMinutes(scanner.nextInt());
        setSeconds(scanner.nextInt());
    }

    public int getHours() {
        return hours;
    }

    public void setHours(final int hours) {
        if (hours >= 0 && hours <= 12) {
            this.hours = hours;
        } else {
            this.hours = (int) ((Math.random() * (12)) + 0);
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(final int minutes) {
        if (minutes >= 0 && minutes <= 60) {
            this.minutes = minutes;
        } else {
            this.minutes = (int) ((Math.random() * (60)) + 0);
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(final int seconds) {
        if (seconds >= 0 && seconds <= 60) {
            this.seconds = seconds;
        } else {
            this.seconds = (int) ((Math.random() * (60)) + 0);
        }
    }

    public int passedTime() {
        return getHours() * 36000000 + getMinutes() * 60000 + getSeconds() * 1000;
    }

}
