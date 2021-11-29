package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections_Task_2 {
    public static List Collections_Task_2(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number; count ++)
        {
            list.add(count);
        }

        return list;
    }
    public static void solveTask(){
        System.out.println("This program takes integer and returns list of that size\n" +
                "filled with numbers from 1 to your number\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        int value1 = scanner.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(Collections_Task_2(value1));
        System.out.println("-----------");

    }
}
