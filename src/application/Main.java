package application;

<<<<<<< HEAD
import application.tasks.Conditions.DoIGetBonus;
import application.tasks.basic.*;
=======
import application.tasks.basic.BeginnerSeries;
import application.tasks.basic.UnderPressure;

import java.util.Scanner;
>>>>>>> refs/remotes/origin/Team5

public class Main {
    private static void choice() {
        System.out.print("\nSelect an option: ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case 0:
                break;
            case 1:
                UnderPressure.task();
                choice();
                break;

        }
    }
    private static String listOfOptions() {
        String listOfOptions =
                "0. Exit\n" +
                "1. Double your number\n" +
                "";

        return listOfOptions;
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        UnderPressure one = new UnderPressure();
        one.one();

        System.out.println(PixelArtPlanning.isDivisible(4050,27));

        System.out.println(JennySecretMessage.greet("Johnny"));

        System.out.println(ConvertToBinary.convertToBinary(117));

        System.out.println(GrassHopper.weatherInfo(23));

        System.out.println(DoIGetBonus.bonusTime(1000,true));
=======
        System.out.println(listOfOptions());
        choice();

>>>>>>> refs/remotes/origin/Team5
    }
}
