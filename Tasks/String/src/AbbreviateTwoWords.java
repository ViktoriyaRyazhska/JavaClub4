import java.util.Locale;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String result = "";
        int nameEndingFlag = name.indexOf(' ');
        String fname = name.substring(0, nameEndingFlag);
        String lname = name.substring(nameEndingFlag + 1);
        char fn = fname.charAt(0);
        char surn = lname.charAt(0);
        result = fn + "." + surn;
        return result.toUpperCase(Locale.ROOT);
    }

}