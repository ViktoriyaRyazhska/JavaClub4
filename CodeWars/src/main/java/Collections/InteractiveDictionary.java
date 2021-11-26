package com.company1;
import java.util.*;

public class InteractiveDictionary {

    public static class Dictionary {
        private HashMap<String, String> map = new HashMap<>();
        public Dictionary(){
            // your code
        }

        public void newEntry(String key, String value){
            map.put(key, value);
        }

        public String look(String key){
            return map.getOrDefault(key, "Cant find entry for " + key);
        }
    }
}
