package Collections.UnifinishedLoop;

import java.util.ArrayList;
import java.util.List;

/**
 * Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!
 */
public class UnfinishedLoopImpl {
        public static List CreateList(int number) {
        List list = new ArrayList();
        for (int i = 1; i <= number; i++) {
            list.add(i++);
        }
        return list;
    }
}
