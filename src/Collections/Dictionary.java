package Collections;

import java.util.*;

public class Dictionary {

    private final Map<String, String> impl = new HashMap<>();

    public Dictionary() {}

    public void newEntry(String key, String value) {
        impl.put(key, value);
    }

    public String look(String key) {
        return impl.getOrDefault(key, "Cant find entry for " + key);
    }
}