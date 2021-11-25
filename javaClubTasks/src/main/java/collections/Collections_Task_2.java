package collections;

import java.util.ArrayList;
import java.util.List;

public class Collections_Task_2 {
    public static List Collections_Task_2(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number; count ++)
        {
            list.add(count);
        }

        return list;
    }
}
