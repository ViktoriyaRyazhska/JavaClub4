package conditions;

import java.util.Scanner;


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

        int valueIsNumers = 0;
        int valueIsNumers2 = 0;
        boolean flag = false;
        boolean flag1 = true;
        boolean flag2 = true;

        while (flag1) {
            System.out.println("Enter salary:");
            String value1 = scanner.next();
            try {
                valueIsNumers = Integer.parseInt(value1);
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
            System.out.println("Enter bonus: 'true' or 'false' :");
            System.out.println("Enter 1 - True");
            System.out.println("Enter 2 - False");
            String value = scanner.next();
            try {
                valueIsNumers2 = Integer.parseInt(value);
                if (valueIsNumers2 == 0 || valueIsNumers2 == 1) {

                    if (valueIsNumers2 == 1) {
                        flag = true;
                        flag2 = false;
                    } else if (valueIsNumers2 == 2) {
                        flag = false;
                        flag2 = false;
                    } else {
                        System.out.println("Please enter a number 1 or 2");
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }
        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(bonusTime(valueIsNumers, flag));
        System.out.println("-----------");
    }

}
