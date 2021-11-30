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

	public static void FindThePosition(Scanner scanner) {
		System.out.println("Find the position");
		System.out.println("When provided with a letter, return its position in the alphabet");
		System.out.println("Enter char");
		String str = scanner.next();
		char ch = str.charAt(0);
		System.out.println("Position: " + FindThePosition.position(ch));
	}

	public static void AllStarCodeChallenge(Scanner scanner) {
		System.out.println("All star code challenge (counts the same letters in the word)");
		System.out.println(
				"Function that accepts 2 string arguments" + "\nand returns an integer of the count of occurrences"
						+ "\nthe 2nd argument is found in the first one");
		System.out.println("Enter string");
		String str = scanner.next();
		System.out.println("Enter char");
		String let = scanner.next();
		char letter = let.charAt(0);
		System.out.println("Count of occurrences: " + AcceptsStringAndCountDoubles.strCount(str, letter));
	}

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
	}

	public static void sayHello() {
		System.out.println("welcome-to-the-city");
		System.out.println("Введіть ім'я, місто та штат, щоб побачити привітання: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String city = scanner.next();
		String state = scanner.next();
		WelcomeToTheCity welcomeToCity = new WelcomeToTheCity();
		System.out.println(WelcomeToTheCity.sayHello(name, city, state));
	}

	public static void tripleTrouble() {
		System.out.println("triple-trouble-2");
		System.out.println("Введіть три слова: ");
		Scanner scanner = new Scanner(System.in);
		String one = scanner.nextLine();
		String two = scanner.nextLine();
		String three = scanner.nextLine();
		TripleTrouble tripleTrouble = new TripleTrouble();
		System.out.println(TripleTrouble.tripleTrouble(one, two, three));
	}

	public static void abbrevName() {
		System.out.println("abbreviate-a-two-word-name");
		System.out.println("Введіть ім'я та прізвище: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		AbbTwoWords twoWordName = new AbbTwoWords();
		System.out.println("Ваші ініціали " + AbbTwoWords.abbrevName(name));
	}
	public static void remove() {
		System.out.println("exclamation-marks-series-number-6-remove-n-exclamation-marks-in-the-sentence-from-left-to-right");
		System.out.println("Введіть слово та цифру: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int n = scanner.nextInt();
		ExclamationMarks remove = new ExclamationMarks();
		System.out.println(ExclamationMarks.remove(s, n));
	}
}