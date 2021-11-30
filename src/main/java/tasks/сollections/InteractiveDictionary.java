package tasks.сollections;

import java.util.HashMap;
import java.util.Map;

public class InteractiveDictionary {

    private final Map<String, String> entryMap;

    public InteractiveDictionary(){
        entryMap = new HashMap<String, String>();
    }

    public void newEntry(String key, String value){

        entryMap.put(key, value);
    }

    public String look(String key){

        if (entryMap.get(key) == null){
            return "Cant find entry for " + key;

        } else {
            return entryMap.get(key);
        }

    }

}
