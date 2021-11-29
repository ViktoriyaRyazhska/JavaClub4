package application.tasks.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GapInPrimes {
    private static List<Integer> primes(int from, int to) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = from; i <= to; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = numbers.get(i) - 1; j > 1; j--) {
                if (numbers.get(i) % j == 0) {
                    numbers.remove(i);
                    i--;
                    break;
                }
            }
        }

        return numbers;
    }

    private static List<Integer> findGap(int gap, List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (Math.abs(numbers.get(i) - numbers.get(i + 1)) == gap) {
                result.add(numbers.get(i));
                result.add(numbers.get(i + 1));
                break;
            }
        }

        return result;
    }

    public List<Integer> getFindGap(int gap, int from, int to) {
        return findGap(gap, primes(from, to));
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter from-number ( >= 2 )\n> ");
        int from = scanner.nextInt();
        System.out.print("Enter to-number ( >= from-number )\n> ");
        int to = scanner.nextInt();
        System.out.print("Enter the gap ( >= 2)\n> ");
        int gap = scanner.nextInt();
        if (from < 2 || to < from || gap < 2) {
            System.out.println("Error.. invalid input");
            task(scanner);
        } else {
            System.out.println("List of prime numbers: " + primes(from, to));
            System.out.println("Result: " + findGap(gap, primes(from, to)));
        }
    }
}
