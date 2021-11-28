package conditions;

import java.util.Scanner;

public class Conditions_task_9 {
    public static String boolToWord(boolean b) {
        String result;
        if (b) {
            result = "Yes";
        } else {
            result = "No";
        }
        return result;
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program can convert boolean value to words YES or NO.\n");
        System.out.println("Press 1 if you want to enter true\n" +
                "Press 0 if you want to enter false");
        int choise ;
        while (!scanner.hasNext("[10]")) {
            System.out.println("You entered something which is not equal to 0 or 1. Try again: ");
            scanner.next();
        }
        choise = scanner.nextInt();
        boolean choose = false;
        switch (choise){
            case 0 : {
                choose = false;
                break;
            }
            case 1: {
                choose = true;
                break;
            }
        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(boolToWord(choose));
        System.out.println("-----------");

    }


}
