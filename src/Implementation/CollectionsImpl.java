package Implementation;
import Collections.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionsImpl {
    public static void createL(Scanner scanner){
        System.out.println("unfinished-loop-bug-fixing-number-1");
        System.out.println("Введіть довжину ArrayList");
        int l = scanner.nextInt();
        System.out.println(CreateList.createList(l));
    }

    public static void PushAnObjectIntoArray(Scanner scanner){
        System.out.println("Push an object into array (solved fix)");
        System.out.println("Enter string");
        String s = scanner.next();
        System.out.println("Returned object" + PushAnObjectIntoArray.push(s));
    }
    public static void FixTheBug(Scanner scanner){
        System.out.println("filtering-even-numbers-bug-fixe");

        System.out.println("Введіть кількість чисел");
        int l = scanner.nextInt();
        System.out.println("Введіть числа");
        List<Integer> list_new = new ArrayList<>(l);
        for(int i = 0; i<l; i++){
            int m = scanner.nextInt();
            list_new.add(i, m);
        }
        System.out.println(EvenBugFix.filterOddNumber(list_new));
    }

    public static void Dictionary(Scanner scanner){
        System.out.println("WIP");
    }

}
