package Basics.AgeRangeCompatibility;


import java.util.Scanner;

/**
 * Everybody knows the classic "half your age plus seven" dating rule that a lot of people follow
 * (including myself).
 * It's the 'recommended' age range in which to date someone.
 */

public class AgeRangeCompatibilityImpl implements AgeRangeCompatibility {
    private int age;

    public AgeRangeCompatibilityImpl(final Scanner scanner) {
        setAge(scanner.nextInt());
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        if(age >= 1 & age <= 100){
            this.age = age;
        }else{
            this.age = (int) ((Math.random() * (100 - 1)) + 1);
        }
    }

    @Override
    public String datingRange() {
        int min, max;
        if (age <= 14) {
            min = (int) (age * 0.9);
            max = (int) (age * 1.1);
        } else {
            min = (int) (age / 2.0) + 7;
            max = (age - 7) * 2;
        }
        return "[" + min + "]" + "-" + "[" + max + "]";
    }
}
