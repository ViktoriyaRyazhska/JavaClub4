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
<<<<<<< HEAD

    public static void OppositeNumber(Scanner scanner) {
        System.out.println("Opposite number");
        System.out.println("Enter value");
        int number = scanner.nextInt();
        System.out.println(OppositeNumber.opposite(number));
    }

    public static void FindThePosition (Scanner scanner) {
        System.out.println("FindThePosition");
        System.out.println("Enter value");
<<<<<<< HEAD
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
=======
    public static void reverseString() {
        System.out.println("reverse string");
        System.out.println("Введіть стрічку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(Kata.solution(str));
        scanner.close();
    }
    public static void removeStringSpaces() {
        System.out.println("removeStringSpaces");
        System.out.println("Введіть стрічку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(KataN.noSpace(str));
        scanner.close();
    }
    public static void grassHopper() {
        System.out.println("grass-hopper");
        System.out.println("Введіть температуру");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        System.out.println(GrassHopper.weatherInfo(temperature));
        scanner.close();
    }
    public static void alternativeCase() {
        System.out.println("alternative case");
        System.out.println("Введіть стрічку");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        System.out.println(StringUtils.toAlternativeString(string));
        scanner.close();
>>>>>>> ee0298bd7dfb1843b5e0df634480e0e78eae927b
    }
    public static void reverseString() {
        System.out.println("reverse string");
        System.out.println("Введіть стрічку");
        Scanner scanner = new Scanner(System.in);
=======
>>>>>>> b8607b9 (trying to save my work)
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
