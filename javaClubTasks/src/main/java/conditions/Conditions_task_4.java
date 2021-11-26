package conditions;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Conditions_task_4 {

    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus == true) {
            int result1 = salary * 10;
            String str = String.valueOf(result1);
            return "\u00A3" + str;
        } else {
            String str2 = String.valueOf(salary);
            return "\u00A3" + str2;
        }
    }

    public static void main(String[] args) {
        System.out.println(bonusTime(1200, true));

    }

    public static void solveTask() {
        System.out.println("This method takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.\n" +
                "If bonus is true, the salary should be multiplied by 10. If bonus is false, \n" +
                "the fatcat did not make enough money and must receive only his stated salary.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary:");
        String value1 = scanner.next();
        int valueIsNumers = isNumeric(value1);
        System.out.println("Enter bonus: 'true' or 'false' :");
        System.out.println("Enter 1 - True");
        System.out.println("Enter 2 - False");
        String valueIsNumers2 = scanner.next();
        int value2 = isNumeric(valueIsNumers2);

        boolean flag;
        if (value2 == 1) {
            flag = true;
        } else if (value2 == 2) {
            flag = false;
        } else {
            flag = false;
            System.out.println("Incorrect data");
        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(bonusTime(valueIsNumers, flag));
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
