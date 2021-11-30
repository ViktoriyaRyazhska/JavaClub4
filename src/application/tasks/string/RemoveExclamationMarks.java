package application.tasks.string;

import java.util.*;

public class RemoveExclamationMarks {

    public static String remove(String s, int n) {
        int count = 0;
        String array[] = s.split("");
        StringBuilder builder = new StringBuilder();

        //replace all "!"
        if (n >= 100) {
            s = s.replace("!", "");
            return s;
        } else if (n < 100) {
            for (int i = 0; i < array.length; i++) {
                if (count >= n) {
                    array[i].replace("!", "");
                } else {
                    break;
                }
            }
        }
        //output
        return builder.toString();
    }
    public String getRemove(String s, int n) {
        return remove(s, n);
    }

    public static void task(Scanner in) {
        in.nextLine();
        System.out.println("Enter sentence  with \"!\":");
        String sentence = in.nextLine();
        System.out.println("How  many \"!\" to remove:");
        int n = in.nextInt();
        System.out.println(remove(sentence, n));
    }
}
