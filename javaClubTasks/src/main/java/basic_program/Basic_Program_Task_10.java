package basic_program;

public class Basic_Program_Task_10 {
    public static String datingRange(int age) {
        return age > 14
                ? (age/2 + 7) + "-" + ((age - 7)*2)
                : (int)(0.90*age) + "-" + (int)(1.10*age);
    }
}
