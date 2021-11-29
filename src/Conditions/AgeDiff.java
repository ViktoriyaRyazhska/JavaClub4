package Conditions;

public class AgeDiff {
    public static String calculateAge(int birth, int yearTo) {
        if (birth > yearTo) {
            String temp = "You will be born in " + (birth - yearTo) + " year";
            return  (birth - yearTo) > 1 ? temp + "s." : temp + ".";
        } else if (yearTo > birth) {
            String temp = "You are " + (yearTo - birth);
            return  (yearTo - birth) > 1 ? temp + " years old." : temp + " year old.";
        } else {
            return "You were born this very year!";
        }
    }
}