package tasks.conditions;

public class TransportationOnVacation {
    public static int rentalCarCost(int day) {
        if(day >= 7) {
            return 40 * day - 50;
        }
        else if(day < 7 && day >= 3) {
            return 40 * day - 20;
        }
        else
            return day * 40;
    }
}
