package BasicProgram;

public class AgeRange {
    public static String datingRange(int age) {
        int min;
        int max;
        if (age <= 14) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
            return min + "-" + max;
        } else {
            min = (age / 2) + 7;
            max = (age - 7) * 2;
            return min + "-" + max;
        }
    }
}