package string;

import java.util.Scanner;

public class String_Task_16 {
    public static String correct(String string) {

        if (string.contains("5") || string.contains("0") || string.contains("1")) {
            string = string.replace("5", "S");
            string = string.replace("0", "O");
            string = string.replace("1", "I");
        }
        return string;
    }

    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
        System.out.println();
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
    }

    public static void solveTask() {
        System.out.println("This method is correct the errors in the digitised text. You only have to handle the following mistakes:\n" +
                "\n" +
                "S is misinterpreted as 5\n" +
                "O is misinterpreted as 0\n" +
                "I is misinterpreted as 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression:");
        String value1 = scanner.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(correct(value1));
        System.out.println("-----------");

    }
}