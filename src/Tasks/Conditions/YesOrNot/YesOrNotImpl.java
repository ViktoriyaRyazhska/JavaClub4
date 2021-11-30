package Tasks.Conditions.YesOrNot;

import java.util.Scanner;

public class YesOrNotImpl implements YesOrNot {
    private boolean bool;

    public YesOrNotImpl(final Scanner scanner) {
        this.bool = scanner.nextBoolean();
    }

    public YesOrNotImpl(final boolean bool) {
        this.bool = bool;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(final boolean bool) {
        this.bool = bool;
    }

    @Override
    public String boolToWord() {
        return isBool() ? "Yes" : "No";
    }

}
