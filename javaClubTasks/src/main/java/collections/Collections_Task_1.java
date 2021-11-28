package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections_Task_1 {

    public static List<String> push(){
        List<String> items = new ArrayList<String>();
        items.add("an object");
        return items;
    }

    public static void solveTask(){

        System.out.println("This task shows you how to push something into ArrayList" +
                "For example, let's push String \"an object\" value into list");
        System.out.println("To make sure if this String is in list let's just print list on the screen");
        System.out.println("Here it is: ");
        System.out.println("-----------");
        System.out.println(push());
        System.out.println("-----------");

    }


}
