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
        System.out.println("Enter value");
        int number = scanner.nextInt();
        System.out.println(OppositeNumber.opposite(number));
    }

    public static void FindThePosition (Scanner scanner) {
        System.out.println("FindThePosition");
        System.out.println("Enter value");
        String str = scanner.next();
        char ch = str.charAt(0);
        System.out.println(FindThePosition.position(ch));
    }

    public static void AllStarCodeChallenge (Scanner scanner) {
        System.out.println("All star codeChallenge");
        System.out.println("Enter value");
        String str = scanner.next();
        String let = scanner.next();
        char letter = let.charAt(0);
        System.out.println(AcceptsStringAndCountDoubles.strCount(str,letter));
    }
}