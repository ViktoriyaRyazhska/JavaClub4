
import java.util.Scanner;

public class Task1 {

	public static int doubleInteger(int number) {
		return number * 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to double:\n> ");
		int number = sc.nextInt();
		System.out.println("Result: " + doubleInteger(number));
	}
}