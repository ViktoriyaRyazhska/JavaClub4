package Basic;
import java.util.Scanner;

public class Task6 {

	public static int toBinary(int n) {
		int multiplier = 1;
		int value = 0;

		do {
			value += (n % 2) * multiplier;
			n /= 2;
			multiplier *= 10;
		} while (n > 0);

		return value;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a non-negative integer:\n> ");
		int number = sc.nextInt();
		System.out.println("Number " + number + " in a binary format is " + toBinary(number));
	}
}
