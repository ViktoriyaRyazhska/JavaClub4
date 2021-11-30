package tasks.string;

public class CorrectString {

    public static String correct(String string) {
        String s1 = string.replaceAll("1", "I").replaceAll("0", "O").replaceAll("5", "S").trim();
        return s1;
    }

}
