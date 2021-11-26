package JavaClub4.src.String;

public class FindThePosition {
    public static String position(char alphabet) {
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < alpha.length; i++){
            if (alpha[i] == alphabet) {
                return "Position of alphabet: " + (i + 1);
            }
        }
        throw new IllegalArgumentException("Incorrect input");
    }
}
