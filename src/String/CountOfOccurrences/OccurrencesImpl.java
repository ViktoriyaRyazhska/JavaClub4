package String.CountOfOccurrences;

public class OccurrencesImpl implements Occurrences {
    private String word;
    private String symbol;

    public OccurrencesImpl(final String word, final String symbol) {
        this.word = word;
        this.symbol = symbol;
    }

    public String getWord() {
        return word;
    }

    public void setWord(final String word) {
        this.word = word;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(final String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int countOfOccurrences() {
        int count = 0;
        for (int i = 0; i < getWord().length(); i++){
            if(String.valueOf(getWord().charAt(i)).equals(getSymbol())){
                count++;
            }
        }
        return count;
    }
}
