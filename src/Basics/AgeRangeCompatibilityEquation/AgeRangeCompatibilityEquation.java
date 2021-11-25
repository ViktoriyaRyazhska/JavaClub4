package Basics.AgeRangeCompatibilityEquation;

/**
 * Everybody knows the classic "half your age plus seven" dating rule that a lot of people follow
 * (including myself).
 * It's the 'recommended' age range in which to date someone.
 */
class AgeRangeCompatiblyEquation  {
    public static String datingRange(int age) {
        int min, max;
        if (age <= 14) {
            min = (int) (age * 0.9);
            max = (int) (age * 1.1);
        } else {
            min = (int) (age / 2.0) + 7;
            max = (int) (age - 7) * 2;
        }
        return min + "-" + max;
    }

}
