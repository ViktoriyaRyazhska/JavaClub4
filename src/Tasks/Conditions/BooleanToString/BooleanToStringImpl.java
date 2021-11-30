package Tasks.Conditions.BooleanToString;

import java.util.Scanner;

public class BooleanToStringImpl implements BooleanToString {
    private boolean bool;

    public BooleanToStringImpl(final Scanner scanner) {
        this.bool = scanner.nextBoolean();
    }

    public BooleanToStringImpl(final boolean bool) {
        this.bool = bool;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(final boolean bool) {
        this.bool = bool;
    }

    @Override
    public String convertToString() {
        return isBool() ? "true" : "false";
    }
}
