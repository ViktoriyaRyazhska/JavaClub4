package String.Position;

import java.util.Random;

public class PositionImpl implements Position {
    private final static String ALL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private String letter;

    public PositionImpl(final String letter) {
        setLetter(letter);
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(final String letter) {
        if (!letter.contains(" ") && letter.matches("[a-zA-Z]")) {
            this.letter = letter;
        } else {
            final Random rnd = new Random();
            this.letter = String.valueOf(ALL_LETTERS.charAt(rnd.nextInt(ALL_LETTERS.length())));
        }
    }

    @Override
    public int findPosition() {
        int pos = 0;
        for (int i = 0; i < ALL_LETTERS.length(); i++) {
            if (String.valueOf(ALL_LETTERS.charAt(i)).equals(letter)) {
                if ((Character.isUpperCase(ALL_LETTERS.charAt(i)))) {
                    pos = i + 1;
                } else {
                    pos = i - 25;
                }
            }
        }
        return pos;
    }
}