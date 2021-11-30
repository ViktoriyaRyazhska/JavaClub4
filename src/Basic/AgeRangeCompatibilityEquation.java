package Basic;

public class AgeRangeCompatibilityEquation {

    public static String CompatibilityEquation(int age) {

        int minAge = (age / 2) + 7;
        int maxAge = (age - 7) * 2;
        if (age > 14 && age < 100) {
            String minA = String.valueOf(minAge);
            String maxA = String.valueOf(maxAge);
            return (minA + "-" + maxA);
        } else {
            return "Your age is not in the range";
        }
    }
}
