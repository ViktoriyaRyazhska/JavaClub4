package conditions;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Conditions_task_8 {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean flag = false;
        int men = flower1 % 2;
        int woomen = flower2 % 2;
        if (men == 0 && woomen != 0 || men != 0 && woomen == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isLove(2, 2));
    }

    public static void solveTask() {
        System.out.println("This method will take the number of petals of each flower and return true if they are in love and false if they aren't.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count flower1:");
        String value1 = scanner.next();
        int valueIsNumers = isNumeric(value1);

        System.out.println("Enter count flower2:");
        String value2 = scanner.next();
        int valueIsNumers2 = isNumeric(value2);


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(isLove(valueIsNumers, valueIsNumers2));
        System.out.println("-----------");

    }

    public static int isNumeric(String str) {
        int value = 0;
        try {
            value = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect Data, please enter a number!");
            chooseMenu();
        }
        return value;
    }
}