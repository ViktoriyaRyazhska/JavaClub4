package application.tasks.loops;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter from-number ( >= 2 )\n> ");
        int from = in.nextInt();
        System.out.print("Enter to-number ( >= from-number )\n> ");
        int to = in.nextInt();
        System.out.print("Enter the gap ( >= 2)\n> ");
        int gap = in.nextInt();
        if (from < 2 || to < from || gap < 2) {
            System.out.println("Error.. invalid input");
            task();
        } else {
            System.out.println("List of prime numbers: " + primes(from, to));
            System.out.println("Result: " + findGap(gap, primes(from, to)));
        }
    }
}
