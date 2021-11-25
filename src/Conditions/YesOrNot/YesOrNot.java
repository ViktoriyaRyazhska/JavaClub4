package Conditions.YesOrNot;

public class YesOrNot {
    private static String boolToWord(boolean b)
    {
        return b ? "Yes": "No";
    }
    public void execute(boolean b){
        System.out.println(boolToWord(b));
    }
}
