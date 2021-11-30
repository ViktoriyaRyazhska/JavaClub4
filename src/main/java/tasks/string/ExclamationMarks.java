package tasks.string;

public class ExclamationMarks {
    public static String remove(String value1, int value2) {
        while (value2-- > 0) value1 = value1.replaceFirst("!", "");
        return value1;
    }
}
