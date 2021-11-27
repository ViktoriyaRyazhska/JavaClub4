package Tasks.String.TripleTrouble;

import java.util.Scanner;

public class TripleTroubleImpl implements TripleTrouble {
    private String a;
    private String b;
    private String c;

    public TripleTroubleImpl(final Scanner scanner) {
        this.a = scanner.nextLine();
        this.b = scanner.nextLine();
        this.c = scanner.nextLine();
    }

    public String getA() {
        return a;
    }

    public void setA(final String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(final String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(final String c) {
        this.c = c;
    }

    @Override
    public String combineTriple() {
        String tmp, str = "";;
        final int size = Math.max(Math.max(a.length(), b.length()), c.length());
        for (int i = 0; i < size; i++){
            tmp = i < a.length() ? String.valueOf(a.charAt(i)) : "";
            tmp += i < b.length() ? String.valueOf(b.charAt(i)) : "";
            tmp += i < c.length() ? String.valueOf(c.charAt(i)) : "";
            str = str.concat(tmp);
        }
        return str;
    }
}
