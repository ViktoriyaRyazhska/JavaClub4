package tasks.string;

public class WordAndCountsOfletters {
    private int wordAndCountOfletter(String str, char letter) {

        char[] s = str.toCharArray();
        int count = 0;


        for (int i = 0; i < s.length; i++) {
            if (s[i] == letter) {
                count++;
            }

        }
        return count;
    }
    public void execute(String str, char letter){System.out.println(wordAndCountOfletter(str,letter));}
}
