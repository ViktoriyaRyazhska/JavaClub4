package Loops;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String repeated = "";
        for(int i = 0;i < repeat;i++){
            repeated += string;
        }
        return repeated;
    }
}
