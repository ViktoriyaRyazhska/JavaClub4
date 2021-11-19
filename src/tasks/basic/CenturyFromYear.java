package tasks.basic;

public class CenturyFromYear {
    public static void execute( int number) {
        System.out.println(centuryFromYear(number));

    }
    private static int centuryFromYear(int number){
        if (number % 100 == 0) {
        number = number / 100;
    } else {
        number = (number / 100) + 1;
    }
        return number;
}
}