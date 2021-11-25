package Collections.Interactive;

import java.util.HashMap;

/**
 * In this kata, your job is to create a class Dictionary which you can add words to and their entries.
 */
public class Dictionary {
    public HashMap<String, String> map;

    public Dictionary() {
        map = new HashMap<>();
    }
    public void newEntry(String key, String value) {
        map.put(key, value);
    }
    public String look(String key) {
        return map.getOrDefault(key, "Cant find entry for " + key);
    }
}


