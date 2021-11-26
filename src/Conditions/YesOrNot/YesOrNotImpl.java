package Conditions.YesOrNot;

public class YesOrNotImpl implements YesOrNot {
    @Override
    public String boolToWord(boolean b) {
        return b ? "Yes": "No";
    }

}
