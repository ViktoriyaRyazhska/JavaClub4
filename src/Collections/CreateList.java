
package Collections;

import java.util.*;

class Kata {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>();
        for (int count = 1; count <= number;) {
            list.add(count);
            count++;
        }
        return list;
    }
}
