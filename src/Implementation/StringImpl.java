package Implementation;

import java.util.Scanner;
import String.*;

public class StringImpl {

	public static void replase(Scanner scanner) {
		System.out.println("fixme-replace-all-dots");
		System.out.println("Введіть стрічку з крапками");
		String str = scanner.next();
		System.out.println(Dinglemouse.replaceDots(str));
	}

	public static void fakeBinary(Scanner scanner) {
		System.out.println("fake-binary");
		System.out.println("Введіть стрічку з цифрами");
		String str = scanner.next();
		System.out.println(FakeBinary.fakeBin(str));
	}

	public static void sortAndStar(Scanner scanner) {
		System.out.println("sort-and-star");
		System.out.println("Введіть довжину масиву слів");
		int l = scanner.nextInt();
		String[] arr = new String[l];
		System.out.println("Введіть стрічку");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}
		System.out.println(SortAndStar.twoSort(arr));
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

	public static void reverseString(Scanner scanner) {
		System.out.println("reverse string");
		System.out.println("Введіть стрічку");
		String str = scanner.next();

		System.out.println(Kata.solution(str));
	}

	public static void removeStringSpaces(Scanner scanner) {
		System.out.println("removeStringSpaces");
		System.out.println("Введіть стрічку");
		String str = scanner.next();

		System.out.println(KataN.noSpace(str));
	}

	public static void grassHopper(Scanner scanner) {
		System.out.println("grass-hopper");
		System.out.println("Введіть температуру");
		int temperature = scanner.nextInt();

		System.out.println(GrassHopper.weatherInfo(temperature));
	}

	public static void alternativeCase(Scanner scanner) {
		System.out.println("alternative case");
		System.out.println("Введіть стрічку");
		String string = scanner.next();

		System.out.println(StringUtils.toAlternativeString(string));
	}

	public static void sayHello(Scanner scanner) {
		System.out.println("welcome-to-the-city");
		System.out.println("Введіть ім'я, місто та штат, щоб побачити привітання: ");
		String name = scanner.next();
		String city = scanner.next();
		String state = scanner.next();
		WelcomeToTheCity welcomeToCity = new WelcomeToTheCity();
		System.out.println(WelcomeToTheCity.sayHello(name, city, state));
	}

	public static void tripleTrouble(Scanner scanner) {
		System.out.println("triple-trouble-2");
		System.out.println("Введіть три слова: ");
		String one = scanner.nextLine();
		String two = scanner.nextLine();
		String three = scanner.nextLine();
		TripleTrouble tripleTrouble = new TripleTrouble();
		System.out.println(TripleTrouble.tripleTrouble(one, two, three));
	}

	public static void abbrevName(Scanner scanner) {
		System.out.println("abbreviate-a-two-word-name");
		System.out.println("Введіть ім'я та прізвище: ");
		String name = scanner.next();
		AbbTwoWords twoWordName = new AbbTwoWords();
		System.out.println("Ваші ініціали " + AbbTwoWords.abbrevName(name));
	}
	public static void remove(Scanner scanner) {
		System.out.println("exclamation-marks-series-number-6-remove-n-exclamation-marks-in-the-sentence-from-left-to-right");
		System.out.println("Введіть слово та цифру: ");
		String s = scanner.next();
		int n = scanner.nextInt();
		ExclamationMarks remove = new ExclamationMarks();
		System.out.println(ExclamationMarks.remove(s, n));
	}

    public static void ConvertANumber(Scanner scanner) {
        System.out.println("convert-a-number-to-a-string");
        System.out.println("Введіть число");
        int l = scanner.nextInt();
        System.out.println(IntToString.numberToString(l));
    }

    public static void PlaysBanjo(Scanner scanner) {
        System.out.println("are-you-playing-banjo");
        System.out.println("Введіть ім'я ");
        String l = scanner.next();
        System.out.println(Banjo.areYouPlayingBanjo(l));
    }

    public static void OldShe(Scanner scanner) {
        System.out.println("parse-nice-int-from-char-problem");
        System.out.println("Введіть стрічку з віком ");
        final String l = scanner.next();
        System.out.println(HowOldShe.howOld(l));
    }

    public static void NiceString(Scanner scanner) {
        System.out.println("correct-the-mistakes-of-the-character-recognition-software");
        System.out.println("Введіть стрічку з цифрами ");
        String l = scanner.next();
        System.out.println(CorrectTheString.correct(l));
    }
}
