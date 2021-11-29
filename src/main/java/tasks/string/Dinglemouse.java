package tasks.string;

public class Dinglemouse {

    private static String replaceDots(final String str) {
        return str.replaceAll("[.]", "-");
    }
    public void execute(String str){
        System.out.println(replaceDots(str));
    }
}