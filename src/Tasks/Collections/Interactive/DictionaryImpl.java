package Tasks.Collections.Interactive;

import java.util.HashMap;
import java.util.Scanner;

/**
 * In this kata, your job is to create a class Dictionary which you can add words to and their entries.
 */
public class DictionaryImpl implements Dictionary{
    private HashMap<String, String> map;
    private String key;
    private String value;

    public DictionaryImpl(final Scanner scanner) {
        this.map = new HashMap<>();
        setKey(scanner.nextLine());
        setValue(scanner.nextLine());
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(final HashMap<String, String> map) {
        this.map = map;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        if (!key.isEmpty() && key.matches("\\b([A-Z][a-z]*)\\b")) {
            this.key = key;
        }else{
            this.key = "Apple";
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        if (!key.isEmpty() && key.matches("\\b([A-Z][a-z]*)\\b")) {
            this.key = key;
        }else{
            this.key = "Fruit";
        };
    }

    @Override
    public void addWord(final Scanner scanner) {
        setKey(scanner.nextLine());
        setValue(scanner.nextLine());
        map.put(getKey(), getValue());
    }

    @Override
    public String findEntry(final Scanner scanner) {
        final String key = scanner.nextLine();
        return map.getOrDefault(key, "Cant find entry for " + key);
    }
}


