package Tasks.Conditions.BooleanToString;

public class BooleanToStringImpl implements BooleanToString {
    @Override
    public String convert(boolean bool) {
        if (bool == true) {
            return "true";
        } else {
            return "false";
        }
    }
}
