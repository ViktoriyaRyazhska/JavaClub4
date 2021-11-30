package application.tasks.conditions;

import java.util.Scanner;

public class TransportationOnVacation {
    public static void task(Scanner scanner){
        System.out.println("Enter number of days you will rent the car");
        int days = scanner.nextInt();
        rentCar(days);
        System.out.println("You need to pay " + rentCar(days) + "$");
    }
    public static int rentCar(int days){
        int rent = 0;
        if(days <= 2){
            rent = 40 * days;
        }else if(days >= 3 || days <= 6){
            rent = (40 * days) - 20;
        }else if(days >= 7){
            rent = (40 * days) - 50;
        }else {
            TransportationOnVacation.rentCar(days);
        }
        return rent;
    }
}
