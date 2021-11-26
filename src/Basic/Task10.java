package JavaClub4.src.Basic;

import java.util.*;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:\n> ");
		int age = sc.nextInt();
		int minAge = (age / 2) + 7;
		int maxAge = (age - 7) * 2;
		if (age > 14 && age < 100) {
			System.out.printf("Your recommended age range is from %d to %d", minAge, maxAge);
		} else {
			System.out.println("Your age is not in the range");
		}
	}
}
