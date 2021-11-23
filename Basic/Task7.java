package basic;

import java.util.Scanner;

public class Task7 {

	public static int Past(int h, int m, int s) {
		return h * 3600000 + m * 60000 + s * 1000;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours:\n> ");
		int h = sc.nextInt();
		System.out.print("Enter minutes:\n> ");
		int m = sc.nextInt();
		System.out.print("Enter seconds:\n> ");
		int s = sc.nextInt();
		int n = Past(h, m, s);
		System.out.println("Milliseconds: " + n);
	}
}
