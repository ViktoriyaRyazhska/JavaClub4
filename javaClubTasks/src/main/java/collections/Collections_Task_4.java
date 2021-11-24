package collections;

import java.util.HashMap;
import java.util.Map;


public class Collections_Task_4 {

    Map<String, String> mapValue1;
    Map<String, String> mapValue2;

    public Collections_Task_4() {
        if (mapValue1 == null && mapValue2 == null) {
            mapValue1 = new HashMap<String, String>();
            mapValue2 = new HashMap<String, String>();
        }
    }

    public void newEntry(String key, String value) {
        for (Map.Entry<String, String> entry : mapValue1.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(key)) {
                mapValue2.put(key, value);
            }
        }
        mapValue1.put(key, value);
    }


    public String look(String key) {
        String res = "";

        for (Map.Entry<String, String> entry : mapValue1.entrySet()) {
            if (entry.getKey().contains(key)) {
                return res = entry.getValue();
            } else {
                for (Map.Entry<String, String> entry2 : mapValue2.entrySet()) {
                    if (entry2.getKey().contains(key)) {
                        return res = entry2.getValue();
                    } else {
                        res = "Cant find entry for " + key;
                    }
                }

            }
            res = "Cant find entry for " + key;
        }

        return res;
    }


    public static void main(String[] args) {

    }

    public static void solveTask(){
        Collections_Task_4 dictionary = new Collections_Task_4();
        dictionary.newEntry("Apple", "Im fruit");
        dictionary.newEntry("Soccer", "A sport");
        dictionary.newEntry("soccer", "a sport");

        System.out.println(dictionary.look("Apple"));
        System.out.println(dictionary.look("Soccer"));
        System.out.println(dictionary.look("soccer"));
        System.out.println(dictionary.look("Hi"));

    }


}
