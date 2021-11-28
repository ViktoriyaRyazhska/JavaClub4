package Basic;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year;
		year = sc.nextInt();
		if (year % 10 != 0) {
			year = (year / 100) + 1;
			System.out.println("Your century is " + year + "th");
		} else if (year % 10 == 0) {
			year = year / 100;
			System.out.println("Your century is " + year + "th");
		} else
			System.out.println("Enter year again");
	}
}