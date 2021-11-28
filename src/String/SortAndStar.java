package String;

public class SortAndStar {
    public static String twoSort(String[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        String res = "";
        String[] arr = s[0].split("");
        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i] + "***";
        }
        res += arr[arr.length - 1];
        System.out.println(res);
        return res;
    }
}