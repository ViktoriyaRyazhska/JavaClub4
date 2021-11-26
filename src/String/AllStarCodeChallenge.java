

public class AllStarCodeChallenge {
    public static int strCount(String str, char letter) {
        int counter = 0;

        for (char c: str.toCharArray()){
            if (c == letter) {
                counter++;
            }
        }
        return counter;
    }
}
