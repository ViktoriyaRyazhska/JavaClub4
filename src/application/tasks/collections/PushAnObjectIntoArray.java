package application.tasks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PushAnObjectIntoArray {
    public static List<String> push(){
        List<String> items = new ArrayList<>();
        items.add("an object");
        return items;
    }
    public static void task(Scanner in) {
        System.out.println(push());
    }
}