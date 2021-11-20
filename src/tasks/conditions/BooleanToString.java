package tasks.conditions;

public class BooleanToString {

    private static String convert(boolean b){
        if(b) {
            return "true";
        } else {
            return "false";
        }
    }

    public void execute(boolean b){
        System.out.println(convert(b));
    }
}
