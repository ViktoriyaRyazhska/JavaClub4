package tasks.сollections;

import java.util.*;

public class UnfinishedLoop {
    private static List CreateList(int number)
    {
        List list = new ArrayList();
        for(int count = 1; count <= number;)
        {
            list.add(count);
            count++;
        }
        return list;
    }
    public void execute(int number){
        System.out.println(CreateList(number));
    }
}
