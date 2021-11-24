public class FindThePosition {

    public static String position(char alphabet) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int position = alph.indexOf(alphabet);
        String result = "Position of alphabet: " +(position+1);
        return result;
    }

}
