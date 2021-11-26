
import java.util.Scanner;

public class Task4 {

	public static boolean isDivisible(int wallLength, int pixelSize) {

		int result = wallLength % pixelSize;

		if (result == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the wall in millimeters:\n> ");
		int wallLength = sc.nextInt();
		System.out.print("Enter the size of a pixel in millimeters:\n> ");
		int pixelSize = sc.nextInt();

		if (isDivisible(wallLength, pixelSize) == true)
			System.out.println("You can fit an exact number of pixels on the given wall");
		else
			System.out.println("You can't fit an exact number of pixels on the given wall");
	}

}
