package tasks.conditions;

public class YearOfBirth {
    public static String calculateAge(int birth, int yearTo) {
        int resultYears;
        if (birth < yearTo) {
            resultYears = yearTo - birth;
            if (resultYears > 1) {
                return String.format("You are %s years old.", resultYears);
            } else
                return String.format("You are %s year old.", resultYears);
        } else if (birth > yearTo) {
            resultYears = birth - yearTo;
            if (resultYears > 1) {
                return String.format("You will be born in %s years.", resultYears);
            } else
                return String.format("You will be born in %s year.", resultYears);
        } else return "You were born this very year!";
    }

    public void execute(int birth, int yearTo){
        System.out.println(calculateAge(birth, yearTo));
    }
}
