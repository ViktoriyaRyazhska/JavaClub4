package String.RemoveSpaces;

public class Main {
    public static void main(final String[] args) {
        final String str = "Re mo vi ng";
        System.out.println(removeSpaces(str));
    }

    public static String removeSpaces(final String str){
        return str.replaceAll(" ","");
    }
}
