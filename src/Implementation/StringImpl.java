package Implementation;

import java.util.Scanner;
import String.*;

public class StringImpl {
    public static void replase() {
        System.out.println("fixme-replace-all-dots");
        System.out.println("Введіть стрічку з крапками");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(Dinglemouse.replaceDots(str));
        scanner.close();
    }

    public static void fakeBinary() {
        System.out.println("fake-binary");
        System.out.println("Введіть стрічку з цифрами");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(FakeBinary.fakeBin(str));
        scanner.close();
    }

    public static void sortAndStar() {
        System.out.println("sort-and-star");
        System.out.println("Введіть довжину масиву слів");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        String[] arr = new String[l];
        System.out.println("Введіть стрічку");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        System.out.println(SortAndStar.twoSort(arr));
        scanner.close();
    }

    public static void OppositeNumber(Scanner scanner) {
        System.out.println("Opposite number");
        System.out.println("Given a number, find its opposite");
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("It's opposite" + OppositeNumber.opposite(number));
    }

    public static void FindThePosition (Scanner scanner) {
        System.out.println("Find the position");
        System.out.println("When provided with a letter, return its position in the alphabet");
        System.out.println("Enter char");
        String str = scanner.next();
        char ch = str.charAt(0);
        System.out.println("Position: " + FindThePosition.position(ch));
    }

    public static void AllStarCodeChallenge (Scanner scanner) {
        System.out.println("All star code challenge (counts the same letters in the word)");
        System.out.println("Function that accepts 2 string arguments" +
                "\nand returns an integer of the count of occurrences" +
                "\nthe 2nd argument is found in the first one");
        System.out.println("Enter string");
        String str = scanner.next();
        System.out.println("Enter char");
        String let = scanner.next();
        char letter = let.charAt(0);
        System.out.println("Count of occurrences: " + AcceptsStringAndCountDoubles.strCount(str,letter));
    }
}
