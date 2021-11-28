package Tasks.Basics.AgeRangeCompatibility;

import java.util.Scanner;

public class AgeRangeCompatibilityImpl implements AgeRangeCompatibility {
    private int age;

    public AgeRangeCompatibilityImpl(final Scanner scanner) {
        setAge(scanner.nextInt());
    }

    public AgeRangeCompatibilityImpl(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        if (age >= 1 & age <= 100) {
            this.age = age;
        } else {
            this.age = (int) ((Math.random() * (100 - 1)) + 1);
        }
    }

    @Override
    public String datingRange() {
        final int min, max;
        if (getAge() <= 14) {
            min = (int) (getAge() * 0.9);
            max = (int) (getAge() * 1.1);
        } else {
            min = (int) (getAge() / 2.0) + 7;
            max = (getAge() - 7) * 2;
        }
        return "[" + min + "]" + "-" + "[" + max + "]";
    }

}
