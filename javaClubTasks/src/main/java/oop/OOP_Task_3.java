package oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OOP_Task_3 extends Encoder {

    public String encode(String source) {
        if(source == null) {return "";}
        Map<Character, String> dictionary = new HashMap<>();
        dictionary.put('a', "4");
        dictionary.put('e', "3");
        dictionary.put('l', "1");
        dictionary.put('m', "/^^\\");
        dictionary.put('o', "0");
        dictionary.put('u', "(_)");
        StringBuilder out = new StringBuilder();
        for (char c : source.toCharArray()) {
            String temp = dictionary.get(Character.toLowerCase(c));
            if(temp == null) {
                temp = Character.toString(c);
            }
            out.append(temp);
        }
        System.out.println(out.toString());
        return out.toString();
    }

    public void solveTask() {

        System.out.println("This program provides some way to encode a string into its leetspeak version.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your letter:");
        String value1 = scanner1.nextLine();
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(encode(value1));
        System.out.println("-----------");
    }
}

abstract class Encoder {
    public abstract String encode(String source);


}
