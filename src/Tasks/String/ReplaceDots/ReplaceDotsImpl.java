package Tasks.String.ReplaceDots;

import java.util.Scanner;

public class ReplaceDotsImpl implements ReplaceDots {
    private String str;

    public ReplaceDotsImpl(final Scanner scanner) {
        setStr(scanner.nextLine());
    }

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
        if (!str.isEmpty() && str.matches("\\.*")) {
            this.str = str;
        } else{
            this.str = "I.t.a.l.y";
        }
    }

    @Override
    public String replaceDotsWithDashes() {
        return str.replaceAll("\\.", "-");
    }
}
