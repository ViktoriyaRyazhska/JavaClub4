package JavaClub4.src.String;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String s = numberString.replaceAll("[0-4]", "0");
        s = s.replaceAll("[5-9]", "1");
        return s;
    }
}