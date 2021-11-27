package Tasks.String.CountOfOccurrences;

import java.util.Scanner;

public class OccurrencesImpl implements Occurrences {
    private String word;
    private char symbol;

    public OccurrencesImpl(final Scanner scanner) {
        this.word = scanner.nextLine();
        this.symbol = scanner.next().charAt(0);
    }

    public String getWord() {
        return word;
    }

    public void setWord(final String word) {
        this.word = word;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(final char symbol) {
        this.symbol = symbol;
    }

    @Override
    public int countOfOccurrences() {
        int count = 0;
        for (int i = 0; i < getWord().length(); i++){
            if(getWord().charAt(i) == getSymbol()){
                count++;
            }
        }
        return count;
    }
}
