package application.tasks.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public HashMap<String, String> hashMap;

    public Dictionary() {
    }

    ;

    public Dictionary(String key, String value) {
        this.hashMap = new HashMap<>() {{
            put(key, value);
        }};
    }

    public void newEntry(String key, String value) {
        // your code
        hashMap.put(key, value);
    }

    public String look(String key) {
        // your code
        return hashMap.get(key);

    }

    public static void task(Scanner in) {
        in.nextLine();
        System.out.println("Add word to the dictionary: ");
        String key = in.nextLine();
        System.out.println("Add definition of the word: ");
        String value = in.nextLine();

        Dictionary dictionary = new Dictionary(key, value);
        dictionary.newEntry(key, value);
        System.out.println(dictionary.look(key));
    }
}
