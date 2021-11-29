package application.tasks.basic;

import java.util.HashMap;
import java.util.Scanner;

public class ConvertToBinary {
    private static int convertToBinary(int n) {
        int temp;
        int position = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        if (n == 0)
            return 0;

        while (n > 0) {
            temp = n % 2;
            n /= 2;
            map.put(position, temp);
            position++;
        }

        for (int i = map.size() - 1; i >= 0; i--) {
            temp = map.get(i);
            stringBuilder.append(temp);
        }
        return Integer.valueOf(stringBuilder.toString());
    }

    public int getConvertToBinary(int n) {
        return convertToBinary(n);
    }

    public static void task(Scanner in) {
        System.out.print("Enter a non-negative integer:\n> ");
        int number = in.nextInt();
        System.out.println("Number " + number + " in a binary format is " + convertToBinary(number));
    }

}
