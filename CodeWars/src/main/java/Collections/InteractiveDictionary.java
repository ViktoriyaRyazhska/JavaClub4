package Collections;
import java.util.*;

public class InteractiveDictionary {

    public class Dictionary {
        private Map<String, String> dict;

        public Dictionary() {
            dict = new HashMap<>();
        }

        public void newEntry(String key, String value) {
            dict.put(key, value);
        }

        public String look(String key) {
            if (dict.containsKey(key))
                return dict.get(key);
            return "Cant find entry for " + key;
        }
    }
}
