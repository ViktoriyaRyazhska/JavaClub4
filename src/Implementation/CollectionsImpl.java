package Implementation;
import Collections.*;
import java.util.Scanner;

public class CollectionsImpl {
    public static void createL(){
        System.out.println("unfinished-loop-bug-fixing-number-1");
        System.out.println("Введіть довжину ArrayList");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        System.out.println(CreateList.createList(l));
        scanner.close();
    }

<<<<<<< HEAD
    public static void PushAnObjectIntoArray(Scanner scanner){
        System.out.println("Push an object into array");
        System.out.println("Enter values");
        String s = scanner.next();
        System.out.println(PushAnObjectIntoArray.push(s));
    }
=======
>>>>>>> ee0298bd7dfb1843b5e0df634480e0e78eae927b
}
