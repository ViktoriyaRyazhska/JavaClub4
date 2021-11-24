public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        String result = "";
        if (yearTo < birth) {
            yearTo = birth - yearTo;
            if (yearTo > 1) {
                result = "You will be born in " + yearTo + " years.";
            } else if (yearTo <= 1) {
                result = "You will be born in " + yearTo + " year.";
            }
        } else if (birth == yearTo) {
            result = "You were born this very year!";
        } else {
            yearTo = yearTo - birth;
            if (yearTo > 1) {
                result = "You are " + yearTo + " years old.";
            } else if (yearTo <= 1) {
                result = "You are " + yearTo + " year old.";
            }
        }
        return result;
    }
}

