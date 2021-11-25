package Collections.UnifinishedLoop;

import java.util.ArrayList;
import java.util.List;

/**
 * Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!
 */
public class UnfinishedLoopimpl {
        public static List CreateList(int number) {
        List list = new ArrayList();
        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }
}
