package Tasks.String.ReversedString;

import java.util.Scanner;

public class ReversedStringImpl implements ReversedString {
    private String str;

    public ReversedStringImpl(final Scanner scanner) {
        setStr(scanner.nextLine());
    }

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
        if (!str.isEmpty() && str.matches("[a-zA-Z0-9]{2,}")) {
            this.str = str;
        } else {
            this.str = "world";
        }
    }

    @Override
    public String toReverseString() {
        String revStr = "";
        for (int i = getStr().length() - 1; i > -1; i--) {
            revStr = revStr.concat(String.valueOf(getStr().charAt(i)));
        }
        return revStr;
    }
}
