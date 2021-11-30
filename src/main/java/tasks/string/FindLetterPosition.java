package tasks.string;

public class FindLetterPosition {
    public static String findLetterPosition(char alphabet){
        char inputLetter = Character.toLowerCase(alphabet);
        int asciiValueOfLetter = (int) inputLetter - 96;
        return "Position of alphabet: " + asciiValueOfLetter;
    }
}
