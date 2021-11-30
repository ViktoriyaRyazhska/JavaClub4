package Application;

import Errors.NotANumber;

import java.util.Scanner;

public class FinallyMethod {
    public static void finallyMethod(Scanner scanner) {
        System.out.print("Maybe you want to find another solution?!\n0 - Back to main menu\n9 - Exit\nYour choice : ");
        switch (NotANumber.CheckInt(scanner)) {
            default -> {
                System.out.println("No such an option.Try one more time");
                FinallyMethod.finallyMethod(scanner);
            }
            case 0 -> {
                System.out.println(ListOfPackages.listOfPackages());
                ListOfPackages.choice();
            }
            case 9 -> {
                System.out.print("Thank you for being with us!\nHave great day!");
            }
        }
    }
}
