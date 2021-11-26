package Conditions;

public class HowOldIn2099 {
    public static String CalculateAge(int birth, int yearTo) {
        return yearTo - birth == 1 ? "You are 1 year old." :
                birth - yearTo == 1 ? "You will be born in 1 year." :
                        yearTo > birth ? "You are " + (yearTo - birth) + " years old." :
                                yearTo < birth ? "You will be born in " + (birth - yearTo) + " years." :
                                        yearTo == birth ? "You were born this very year!" : "Error";
    }
}
