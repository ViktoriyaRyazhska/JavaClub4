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

        int valueIsNumers = 0;
        int valueIsNumers2 = 0;
        boolean flag1 = true;
        boolean flag2 = true;

        while (flag1) {
            System.out.println("Enter count flower1:");
            String valueString = scanner.next();

            try {
                valueIsNumers = Integer.parseInt(valueString);
                if (valueIsNumers > 0) {
                    flag1 = false;
                } else {
                    System.out.println("The value cannot be less than 1");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }
        }

        while (flag2) {
            System.out.println("Enter count flower2:");
            String valueString = scanner.next();

            try {
                valueIsNumers = Integer.parseInt(valueString);
                if (valueIsNumers > 0) {
                    flag2 = false;
                } else {
                    System.out.println("The value cannot be less than 1");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }

        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(isLove(valueIsNumers, valueIsNumers2));
        System.out.println("-----------");

    }

}
