package application.tasks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnfinishedLoop {
    private static List createList(int size) {
        List list = new ArrayList();

        for (int i = 1; i <= size; i++) {
            list.add(i);
        }

        return list;
    }

    public List getCreatedList(int size) {
        return createList(size);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter size of list:\n> ");
        int size = scanner.nextInt();
        System.out.println("Result: " + createList(size));
    }
}
