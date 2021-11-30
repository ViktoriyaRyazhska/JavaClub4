package Collections;
import java.util.*;

public class InteractiveDictionary {

    public static class Dictionary {
        private static Map<String, String> dict;

        public Dictionary(Map map) {
            dict = new HashMap<>();
        }

        public static Object newEntry(String key, String value) {
            dict.put(key, value);
            return dict;
        }

        public static String look(String key) {
            if (dict.containsKey(key))
                return dict.get(key);
            return "Cant find entry for " + key;
        }
    }
}
