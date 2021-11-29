package Basic;


public class AgeRangeCompatibilityEquation {

    public static void CompatibilityEquation(int age) {

        int minAge = (age / 2) + 7;
        int maxAge = (age - 7) * 2;
        if (age > 14 && age < 100) {
            System.out.printf("Your recommended age range is from %d to %d", minAge, maxAge);
        } else {
            System.out.println("Your age is not in the range");
        }
    }
}
