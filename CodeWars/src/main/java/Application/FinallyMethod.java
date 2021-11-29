package Application;

import java.util.Scanner;

public class FinallyMethod {
    public static void finallyMethod(Scanner scanner) {
        System.out.print("Maybe you want to find another solution?!\n0 - Back to main menu\n9 - Exit\nYour choice : ");
        switch (scanner.nextInt()) {
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
