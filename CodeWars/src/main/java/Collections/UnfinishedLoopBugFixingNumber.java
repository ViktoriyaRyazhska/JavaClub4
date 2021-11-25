package com.company1;
import java.util.*;

public class UnfinishedLoopBugFixingNumber {
    public static List CreateList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number; count++)
        {
            list.add(count);
        }

        return list;
    }
}
