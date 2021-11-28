
package Collections;

import java.util.*;

public class CreateList {
    public static List<Integer> createList(int number) {
        List<Integer> list = new ArrayList<>();
        for (int count = 1; count <= number;) {
            list.add(count);
            count++;
        }
        return list;
    }
}
