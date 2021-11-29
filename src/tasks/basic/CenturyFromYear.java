package tasks.basic;

public class CenturyFromYear {
    public static void execute( int number) {
        System.out.println(centuryFromYear(number));

    }
    public static int centuryFromYear(int number){
        try {
            if(number ==0){
                System.out.println("Division for 0");
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        if (number % 100 == 0) {
        number = number / 100;
    } else {
        number = (number / 100) + 1;
    }
        return number;
}
}