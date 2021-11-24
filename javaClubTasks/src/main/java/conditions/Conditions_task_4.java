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

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary:");
        int value1 = scanner.nextInt();
        System.out.println("Enter bonus: 'true' or 'false' :");
        System.out.println("Enter 1 - True");
        System.out.println("Enter 2 - False");
        int value2 = scanner.nextInt();

        boolean flag;
        if(value2 == 1){
            flag = true;
        } else if(value2 == 2){
            flag = false;
        } else {
            flag = false;
            System.out.println("Incorrect data");
        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(bonusTime(value1, flag));
        System.out.println("-----------");

    }
}
