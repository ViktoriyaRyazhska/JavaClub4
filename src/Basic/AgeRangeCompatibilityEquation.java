package Basic;

public class AgeRangeCompatibilityEquation {

    public static String CompatibilityEquation(int age) {
        int minAge;
        int maxAge;
        String minA, maxA;
        if (age > 14 && age <= 100) {
            minAge = (age / 2) + 7;
            maxAge = (age - 7) * 2;
        } else {
            minAge = (int) (age - 0.10 * age);
            maxAge = (int) (age + 0.10 * age);
        }
        minA = String.valueOf(minAge);
        maxA = String.valueOf(maxAge);
        return minA + "-" + maxA;
    }
}
