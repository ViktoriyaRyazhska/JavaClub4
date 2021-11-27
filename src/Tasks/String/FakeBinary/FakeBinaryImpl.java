package Tasks.String.FakeBinary;

import java.util.Scanner;

public class FakeBinaryImpl implements FakeBinary {
    private String digits;

    public FakeBinaryImpl(final Scanner scanner) {
        setDigits(scanner.nextLine());
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(final String digits) {
        if (!digits.isEmpty() && digits.matches("\\b[0-9]*\\b")) {
            this.digits = digits;
        } else {
            this.digits = "0123456789";
        }
    }

    @Override
    public String replaceDigits() {
        String str = getDigits();
        str = str.replaceAll("[1-5]", "0");
        str = str.replaceAll("[6-9]", "1");
        return str;
    }
}
