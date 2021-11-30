package tasks.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.chars()
                .mapToObj(i -> i < 53 ? "0" : "1")
                .collect(Collectors.joining());
    }
    // Different implementation of the task //
//    public static String fakeBin(String numberString){
//        List<String> list = Arrays.asList(numberString.split(""));
//        List<Integer> ints = list.stream().
//                map(Integer::parseInt).
//                collect(Collectors.toList());
//        ints.replaceAll(d -> d < 5 ? 0:1);
//        return ints.toString();
//    }
}
