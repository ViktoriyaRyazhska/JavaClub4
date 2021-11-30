package tasks.сollections;

import java.util.ArrayList;
import java.util.List;

public class PushObjectIntoArray {

    public static List<String> push(String str){
        List<String> items = new ArrayList<>();
        items.add(str);
        return items;
    }

    public void execute(String str){
        System.out.println(push(str));
    }
}
